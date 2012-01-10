/*
 * LensKit, a reference implementation of recommender algorithms.
 * Copyright 2010-2011 Regents of the University of Minnesota
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package org.grouplens.inject.spi;

/**
 * A rule expressing an injector binding.  Bind rules can <i>match</i> desires,
 * in which case they apply to the desire.  They can then be <i>applied</i> to
 * the matching desire, returning a new desire which satisfies the original and
 * is (hopefully) one step closer to producing a fully-resolved type.
 * 
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 *
 */
public interface BindRule {
    // FIXME: [ML] Add a method to stop following bind rules
    /**
     * Query whether this bind rule applies to some desire.
     * 
     * @param desire The desire to test.
     * @return <tt>true</tt> if this rule applies to the desire and can be used
     *         to further resolve it.
     */
    boolean matches(Desire desire);
    
    /**
     * Apply this rule to a desire, producing a desire <tt>d2</tt> such that
     * <code>desire.isSatisfiedBy(d2)</code> is true.
     * 
     * @param desire The desire to apply to.
     * @return The result of applying this rule to the desire, bringing it
     *         closer to resolution.
     */
    Desire apply(Desire desire);
}
