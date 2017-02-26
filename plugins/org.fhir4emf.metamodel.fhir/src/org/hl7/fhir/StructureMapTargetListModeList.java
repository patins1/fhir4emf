/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Structure Map Target List Mode List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getStructureMapTargetListModeList()
 * @model extendedMetaData="name='StructureMapTargetListMode-list'"
 * @generated
 */
public enum StructureMapTargetListModeList implements Enumerator {
	/**
	 * The '<em><b>First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST(0, "first", "first"),

	/**
	 * The '<em><b>Share</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARE_VALUE
	 * @generated
	 * @ordered
	 */
	SHARE(1, "share", "share"),

	/**
	 * The '<em><b>Last</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_VALUE
	 * @generated
	 * @ordered
	 */
	LAST(2, "last", "last"),

	/**
	 * The '<em><b>Collate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLATE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLATE(3, "collate", "collate");

	/**
	 * The '<em><b>First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First
	 * <!-- end-model-doc -->
	 * @see #FIRST
	 * @model name="first"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_VALUE = 0;

	/**
	 * The '<em><b>Share</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Share
	 * <!-- end-model-doc -->
	 * @see #SHARE
	 * @model name="share"
	 * @generated
	 * @ordered
	 */
	public static final int SHARE_VALUE = 1;

	/**
	 * The '<em><b>Last</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last
	 * <!-- end-model-doc -->
	 * @see #LAST
	 * @model name="last"
	 * @generated
	 * @ordered
	 */
	public static final int LAST_VALUE = 2;

	/**
	 * The '<em><b>Collate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collate
	 * <!-- end-model-doc -->
	 * @see #COLLATE
	 * @model name="collate"
	 * @generated
	 * @ordered
	 */
	public static final int COLLATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Structure Map Target List Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StructureMapTargetListModeList[] VALUES_ARRAY =
		new StructureMapTargetListModeList[] {
			FIRST,
			SHARE,
			LAST,
			COLLATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Structure Map Target List Mode List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StructureMapTargetListModeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Structure Map Target List Mode List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapTargetListModeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapTargetListModeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Target List Mode List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapTargetListModeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StructureMapTargetListModeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Structure Map Target List Mode List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StructureMapTargetListModeList get(int value) {
		switch (value) {
			case FIRST_VALUE: return FIRST;
			case SHARE_VALUE: return SHARE;
			case LAST_VALUE: return LAST;
			case COLLATE_VALUE: return COLLATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StructureMapTargetListModeList(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StructureMapTargetListModeList
