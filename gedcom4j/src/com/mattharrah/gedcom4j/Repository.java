/*
 * Copyright (c) 2009-2011 Matthew R. Harrah
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package com.mattharrah.gedcom4j;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	public String xref;
	public String name;
	public String regFileNumber;
	public String recIdNumber;
	public Address address;
	public List<Note> notes = new ArrayList<Note>();
	public ChangeDate changeDate;
	public List<UserReference> userReferences = new ArrayList<UserReference>();
	public List<String> phoneNumbers = new ArrayList<String>();

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Repository other = (Repository) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (changeDate == null) {
			if (other.changeDate != null) {
				return false;
			}
		} else if (!changeDate.equals(other.changeDate)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (notes == null) {
			if (other.notes != null) {
				return false;
			}
		} else if (!notes.equals(other.notes)) {
			return false;
		}
		if (phoneNumbers == null) {
			if (other.phoneNumbers != null) {
				return false;
			}
		} else if (!phoneNumbers.equals(other.phoneNumbers)) {
			return false;
		}
		if (recIdNumber == null) {
			if (other.recIdNumber != null) {
				return false;
			}
		} else if (!recIdNumber.equals(other.recIdNumber)) {
			return false;
		}
		if (regFileNumber == null) {
			if (other.regFileNumber != null) {
				return false;
			}
		} else if (!regFileNumber.equals(other.regFileNumber)) {
			return false;
		}
		if (userReferences == null) {
			if (other.userReferences != null) {
				return false;
			}
		} else if (!userReferences.equals(other.userReferences)) {
			return false;
		}
		if (xref == null) {
			if (other.xref != null) {
				return false;
			}
		} else if (!xref.equals(other.xref)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
		        + ((changeDate == null) ? 0 : changeDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result
		        + ((phoneNumbers == null) ? 0 : phoneNumbers.hashCode());
		result = prime * result
		        + ((recIdNumber == null) ? 0 : recIdNumber.hashCode());
		result = prime * result
		        + ((regFileNumber == null) ? 0 : regFileNumber.hashCode());
		result = prime * result
		        + ((userReferences == null) ? 0 : userReferences.hashCode());
		result = prime * result + ((xref == null) ? 0 : xref.hashCode());
		return result;
	}

}
