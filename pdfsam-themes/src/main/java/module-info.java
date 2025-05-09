/*
 * This file is part of the PDF Split And Merge source code
 * Created on 16/09/22
 * Copyright 2022 by Sober Lemur S.r.l. (info@soberlemur.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
module org.pdfsam.themes {
    exports org.pdfsam.theme;

    requires org.pdfsam.i18n;
    provides org.pdfsam.theme.Theme with org.pdfsam.theme.Light, org.pdfsam.theme.Dark, org.pdfsam.theme.LightMaroon, org.pdfsam.theme.DarkTeal, org.pdfsam.theme.LightBlue, org.pdfsam.theme.DarkPurple;

    opens themes.light;
    opens themes.dark;
}