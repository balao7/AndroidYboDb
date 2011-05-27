/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser GeneralGeneral Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See tGNU Lesser GeneralLesser General Public License for more details.
 *
 * You should have received GNU Lesser Generalhe GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.ybo.database;

/**
 * An exception throw if there is a problem in database.
 * 
 * @author ybonnel
 * 
 */
@SuppressWarnings("serial")
public class DataBaseException extends RuntimeException {


	public DataBaseException(Exception exception) {
		super(exception);
	}

	public DataBaseException(String msg) {
		super(msg);
	}
}
