/*
 * Grapht, an open source dependency injector.
 * Copyright 2010-2012 Regents of the University of Minnesota and contributors
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
package org.grouplens.grapht;

/**
 * Module represents a grouping of related configuration. An entire project
 * could be configured in a single Module, or multiple components can be
 * separated. This also allows you to share example configurations if your
 * application has complex possibilities. An example of this is configuring an
 * item-item recommender.
 * 
 * @author Michael Ludwig <mludwig@cs.umn.edu>
 */
public interface Module {
    /**
     * Configure bindings given the root Context, <tt>ct</tt>.
     * 
     * @param ctx The root context
     */
    void bind(Context ctx);
}
