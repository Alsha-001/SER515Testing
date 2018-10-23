package test.java;



import org.junit.After;
import org.junit.Before;
import main.java.Item;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import main.java.SortAlgos;

public class AlgoTest {

	private SortAlgos sorting;

	@Before
	public void setUp() throws Exception {
		sorting = new SortAlgos();
	}

	@After
	public void tearDown() throws Exception {
		sorting = null;
		assertNull(sorting);

	}
	// Bubble Sort test cases
	@Test(expected = java.lang.NullPointerException.class)
	public void checkBubbleSortEmpty() {
		Item[] emptyElements= null;
		SortAlgos.bubbleSort(emptyElements);
	}

	@Test
	public void checkBubbleSort() {
		int[] ele = { 11, 21, 13, 10, 0, 33 };
		Item[] bubbleItems = new Item[6];
		for (int i = 0; i < ele.length; i++)
			bubbleItems[i] = new Item(ele[i]);

		int[] eleSorted = { 0,10,11, 13, 21, 33};
		Item[] bubbleSorted = new Item[6];
		for (int i = 0; i < eleSorted.length; i++)
			bubbleSorted[i] = new Item(eleSorted[i]);

		SortAlgos.bubbleSort(bubbleItems);
		for (int i = 0; i < bubbleItems.length; i++)
			assertEquals("Check bubble sort gives sorted elements", bubbleItems[i].key, bubbleSorted[i].key);
	}

	// Merge Sort test cases
	@Test(expected = java.lang.NullPointerException.class)
	public void checkMergeSortEmpty() {
		Item[] emptyEle = null;
		SortAlgos.mergeSort(emptyEle);
	}


	@Test
	public void checkMergeSort() {
		int[] ele = { 11, 21, 10, 0, 33 };
		Item[] mergeItems = new Item[5];
		for (int i = 0; i < ele.length; i++)
			mergeItems[i] = new Item(ele[i]);

		int[] eleSorted = { 0,10,11, 21, 33};
		Item[] mergeSorted = new Item[5];
		for (int i = 0; i < eleSorted.length; i++)
			mergeSorted[i] = new Item(eleSorted[i]);

		SortAlgos.mergeSort(mergeItems);
		for (int i = 0; i < mergeItems.length; i++)
			assertEquals("Check merge sort gives sorted elements", mergeItems[i].key, mergeSorted[i].key);
	}
	// Selection Sort test cases
	@Test
	public void checkSelectionSort() {
		int[] ele = { 11, 21, 100, 13, 10, 0, 33 };
		Item[] selectionItems = new Item[7];
		for (int i = 0; i < ele.length; i++)
			selectionItems[i] = new Item(ele[i]);

		int[] eleSorted = { 0,10,11, 13, 21, 33, 100};
		Item[] selectionSorted = new Item[7];
		for (int i = 0; i < eleSorted.length; i++)
			selectionSorted[i] = new Item(eleSorted[i]);

		SortAlgos.selectionSort(selectionItems);
		for (int i = 0; i < selectionItems.length; i++)
			assertEquals("Check selection sort gives sorted elements", selectionItems[i].key, selectionSorted[i].key);
	}

	// Insertion Sort test cases
	@Test(expected = java.lang.NullPointerException.class)
	public void checkInsertionSortEmpty() {
		Item[] emptyEle = null;
		SortAlgos.insertionSort(emptyEle);
	}


	@Test
	public void checkInsertionSort() {
		int[] ele = { 11, 21, 10, 0, 33 };
		Item[] insertionItems = new Item[5];
		for (int i = 0; i < ele.length; i++)
			insertionItems[i] = new Item(ele[i]);

		int[] eleSorted = { 0,10,11, 21, 33};
		Item[] insertionSorted = new Item[5];
		for (int i = 0; i < eleSorted.length; i++)
			insertionSorted[i] = new Item(eleSorted[i]);

		SortAlgos.insertionSort(insertionItems);
		for (int i = 0; i < insertionItems.length; i++)
			assertEquals("Check insertion sort gives sorted elements", insertionItems[i].key, insertionSorted[i].key);
	}


	// Heap Sort test cases
	@Test
	public void checkHeapSort() {
		int[] ele = { 100, 99, 105, 134 };
		Item[] heapItems = new Item[4];
		for (int i = 0; i < ele.length; i++)
			heapItems[i] = new Item(ele[i]);

		int[] eleSorted = { 99, 100, 105, 134 };
		Item[] heapSorted = new Item[4];
		for (int i = 0; i < eleSorted.length; i++)
			heapSorted[i] = new Item(eleSorted[i]);

		SortAlgos.heapSort(heapItems);
		for (int i = 0; i < heapItems.length; i++)
			assertEquals("Check heap sort gives sorted elements", heapItems[i].key, heapSorted[i].key);
	}


	// Quick Sort test cases
	@Test(expected = java.lang.NullPointerException.class)
	public void checkQuickSortEmpty() {
		Item[] emptyItems = null;
		SortAlgos.quickSort(emptyItems);
	}

	@Test
	public void checkQuickSort() {
		int[] ele = {10, 40, 20, 30, 50};
		Item[] quickItems = new Item[5];
		for (int i = 0; i < ele.length; i++)
			quickItems[i] = new Item(ele[i]);

		int[] eleSorted = { 10, 20, 30, 40, 50 };
		Item[] quickSorted = new Item[5];
		for (int i = 0; i < eleSorted.length; i++)
			quickSorted[i] = new Item(eleSorted[i]);

		SortAlgos.quickSort(quickItems);
		for (int i = 0; i < quickItems.length; i++)
			assertEquals("Check quick sort gives sorted elements", quickItems[i].key, quickSorted[i].key);
	}


	@Test
	public void checkQuickSortForSingleElement() {
		Item[] ele = { new Item(1) };
		Item[] eleSorted = { new Item(1) };

		SortAlgos.quickSort(ele);
		for (int i = 0; i < ele.length; i++)
			assertEquals("Check quick sort for only one element", ele[i].key, eleSorted[i].key);
	}		

}
