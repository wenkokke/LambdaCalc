package lambdacalc.impl;

import static lombok.AccessLevel.PRIVATE;

import java.util.Map;
import java.util.Set;

import lambdacalc.FreshNameSupplier;
import lambdacalc.Symbol;
import lambdacalc.Type;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.experimental.FieldDefaults;

import com.google.common.collect.Maps;

@RequiredArgsConstructor
@FieldDefaults(makeFinal=true,level=PRIVATE)
public final class IFreshNameSupplier implements FreshNameSupplier {

	Map<Type,   String>  names;
	Map<String, Integer> indices = Maps.newHashMap();
	Set<String>          reserved;
	
	@Override
	public final Symbol fresh(final Type type) {
		return new ISymbol(nextName(baseName(type)),type);
	}
	
	private final String baseName(final Type type) {
		val baseName = names.get(type);
		if (baseName == null) {
			return "x";
		}
		else {
			return baseName;
		}
	}
	
	// get name and check if it is reserved;
	private final String nextName(final String basename) {
		val name = basename + nextIndex(basename);
		if (reserved.contains(name)) {
			return nextName(basename);
		}
		else {
			return name;
		}
	}
	
	// get and increment the index for a certain basename;
	private final synchronized Integer nextIndex(final String basename) {
		val index = indices.get(basename);
		if (index == null) {
			indices.put(basename, 1);
			return 0;
		}
		else {
			indices.put(basename, index + 1);
			return index;
		}
	}
	
}
