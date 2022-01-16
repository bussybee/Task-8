package ru.vsu.cs.maslovaei;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.Utils.ArrayUtils;

public class TestForProgram {
    @Test
    public void test1() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input01.txt");
        arrayForTest = ArrayWithoutMinAndMaxElements.createdNewArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/output01.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void test2() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input02.txt");
        arrayForTest = ArrayWithoutMinAndMaxElements.createdNewArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/output02.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void test3() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input03.txt");
        arrayForTest = ArrayWithoutMinAndMaxElements.createdNewArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/output03.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void test4() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input04.txt");
        arrayForTest = ArrayWithoutMinAndMaxElements.createdNewArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/output04.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }

    @Test
    public void test5() {
        int [][] arrayForTest = ArrayUtils.readIntArray2FromFile("TestCase/input05.txt");
        arrayForTest = ArrayWithoutMinAndMaxElements.createdNewArray(arrayForTest);
        int[][] resultArray = ArrayUtils.readIntArray2FromFile("TestResult/output05.txt");
        Assert.assertArrayEquals(resultArray, arrayForTest);
    }
}