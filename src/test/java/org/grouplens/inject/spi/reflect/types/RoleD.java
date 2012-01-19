/*
 * LensKit, an open source recommender systems toolkit.
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
package org.grouplens.inject.spi.reflect.types;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.grouplens.inject.annotation.DefaultType;
import org.grouplens.inject.annotation.InheritsDefaultRole;
import org.grouplens.inject.annotation.Role;

@Role
@DefaultType(TypeB.class)
@InheritsDefaultRole
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleD { }
