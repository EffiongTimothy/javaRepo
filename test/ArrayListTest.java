
import ChapterSeven.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

	private MyArrayList myArrayList;

	@BeforeEach
	public void startEachTestWith() {
		myArrayList = new MyArrayList(5);
	}

	@Test
	public void arrayListCanBeCreatedTest() {
		assertNotNull(myArrayList);
	}

	@Test
	public void newArrayListIsEmptyTest() {
		assertTrue(myArrayList.isEmpty());
	}

	@Test
	public void addElement_ArrayListShouldNotBeEmptyTest() {
		myArrayList.add(34);
		assertFalse(myArrayList.isEmpty());
	}

	@Test
	public void addXRemoveX_ArrayListShouldBeEmpty() {
		//when
		myArrayList.add(34);
		myArrayList.remove(1);
		//assert
		assertTrue(myArrayList.isEmpty());

	}

	@Test
	public void addXAndY_removeY_arrayShouldNotBeEmpty() {
		//when
		myArrayList.add(34);
		myArrayList.add(99);
		myArrayList.remove(1);
		assertFalse(myArrayList.isEmpty());
	}

	@Test
	public void removeFromEmptyArrayList_shouldThrowException() {
		assertThrows(IllegalArgumentException.class, () -> myArrayList.remove(34));
	}

	@Test
	public void addOneElement_arrayListSizeIsOne() {
		myArrayList.add(34);
		myArrayList.add(6);
		assertEquals(2, myArrayList.size());
	}

	@Test
	public void addElement_arrayListSizeIncreases() {
		myArrayList.add(34);
		myArrayList.add(34);
		assertEquals(2, myArrayList.size());
	}

	@Test
	public void insertElementInArrayList() {
		myArrayList.add(34);
		myArrayList.add(94);
		assertEquals(94, myArrayList.get(1));
		assertEquals(34, myArrayList.get(0));
		assertEquals(2, myArrayList.size());
	}

	@Test
	public void addThreeElement_getSecondByIndex() {
		myArrayList.add(34);
		myArrayList.add(32);
		myArrayList.add(99);
		assertEquals(32, myArrayList.get(1));
	}

	@Test
	public void getIndexOfElementTest() {
		myArrayList.add(34);
		myArrayList.add(32);
		myArrayList.add(99);
		assertEquals(2, myArrayList.getIndexOf(99));
	}
@Disabled
	@Test
	public void arrayListIsElasticTest() {
		assertEquals(3, myArrayList.getCapacity());
		myArrayList.add(34);
		myArrayList.add(32);
		myArrayList.add(99);
		myArrayList.add(99);
		myArrayList.add(45);
		assertEquals(6, myArrayList.getCapacity());
		assertEquals(5, myArrayList.size());
		myArrayList.add(43);
		myArrayList.add(21);
		assertEquals(12, myArrayList.getCapacity());
		assertEquals(7, myArrayList.size());
	}

@Disabled
	@Test
	public void addXYZ_removeY_ZShouldBeInPositionOfY() {
		myArrayList.add(34);
		myArrayList.add(32);
		myArrayList.add(99);
		myArrayList.remove(32);
		assertEquals(99, myArrayList.get(1));
		assertEquals(2, myArrayList.size());
		assertEquals(0, myArrayList.get(2));
	}


}