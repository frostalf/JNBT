/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jnbt;

import java.util.Arrays;

/**
 *
 * @author Frostalf
 */
public class LongArrayTag extends Tag {

    private final long[] value;

    public LongArrayTag(final String name, final long[] value) {
        super(name);
        this.value = value;
    }

    @Override
    public long[] getValue() {
        return value;
    }

    @Override
	public String toString() {

		final StringBuilder longS = new StringBuilder();
		for (final long b : value) {
			longS.append(b).append(" ");
		}
		final String name = getName();
		String append = "";
		if ((name != null) && !name.equals("")) {
			append = "(\"" + getName() + "\")";
		}
		return "TAG_Int_Array" + append + ": " + longS.toString();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = super.hashCode();
		result = (prime * result) + Arrays.hashCode(value);
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {

		if (this == obj) { return true; }
		if (!super.equals(obj)) { return false; }
		if (!(obj instanceof IntArrayTag)) { return false; }
		final LongArrayTag other = (LongArrayTag) obj;
		if (!Arrays.equals(value, other.value)) { return false; }
		return true;
	}
}
