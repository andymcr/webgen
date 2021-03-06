/**
 */
package uk.ac.man.cs.mdsd.webgen.webui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Index Display Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.webgen.webui.WebuiPackage#getIndexDisplayOption()
 * @model
 * @generated
 */
public enum IndexDisplayOption implements Enumerator {
	/**
	 * The '<em><b>Grid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRID_VALUE
	 * @generated
	 * @ordered
	 */
	GRID(0, "Grid", "Grid"),

	/**
	 * The '<em><b>Page Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_DIRECTION(1, "PageDirection", "PageDirection"),

	/**
	 * The '<em><b>Line Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_DIRECTION(2, "LineDirection", "LineDirection"), /**
	 * The '<em><b>Cards</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARDS_VALUE
	 * @generated
	 * @ordered
	 */
	CARDS(3, "Cards", "Cards");

	/**
	 * The '<em><b>Grid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRID
	 * @model name="Grid"
	 * @generated
	 * @ordered
	 */
	public static final int GRID_VALUE = 0;

	/**
	 * The '<em><b>Page Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_DIRECTION
	 * @model name="PageDirection"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_DIRECTION_VALUE = 1;

	/**
	 * The '<em><b>Line Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DIRECTION
	 * @model name="LineDirection"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DIRECTION_VALUE = 2;

	/**
	 * The '<em><b>Cards</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cards</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARDS
	 * @model name="Cards"
	 * @generated
	 * @ordered
	 */
	public static final int CARDS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Index Display Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IndexDisplayOption[] VALUES_ARRAY =
		new IndexDisplayOption[] {
			GRID,
			PAGE_DIRECTION,
			LINE_DIRECTION,
			CARDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Index Display Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IndexDisplayOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Index Display Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndexDisplayOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IndexDisplayOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Index Display Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndexDisplayOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IndexDisplayOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Index Display Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IndexDisplayOption get(int value) {
		switch (value) {
			case GRID_VALUE: return GRID;
			case PAGE_DIRECTION_VALUE: return PAGE_DIRECTION;
			case LINE_DIRECTION_VALUE: return LINE_DIRECTION;
			case CARDS_VALUE: return CARDS;
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
	private IndexDisplayOption(int value, String name, String literal) {
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
	
} //IndexDisplayOption
