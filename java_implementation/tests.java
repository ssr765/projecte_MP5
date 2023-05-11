import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	public void test1() {
		assertTrue(classe.metode([5,1,0,6,2])== [0,1,2,5,6]);
	}
	
	@Test
	public void test2() {
		assertTrue(classe.metode([7,1,3,20,74,12])== [1,3,7,12,20,74]);
	}
	
  
	@Test
	public void test3() {
	  assertTrue(classe.metode([5, 1, 0, 6, 2])== [0, 1, 2, 5, 6]);
	}
	
	@Test
	public void test4() {
	  assertTrue(classe.metode([7, 1, 3, 20, 74, 12])== [1, 3, 7, 12, 20, 74]);
	}
	
	@Test
	public void test5() {
	  assertTrue(classe.metode([3, 5, 2, 7, 1, 8, 4, 6])== [1, 2, 3, 4, 5, 6, 7, 8]);
	}
	
	@Test
	public void test6() {
	  assertTrue(classe.metode([10, 8, 6, 4, 2, 0])== [0, 2, 4, 6, 8, 10]);
	}
	
	@Test
	public void test7() {
	  assertTrue(classe.metode([1, 2, 3, 4, 5, 6, 7, 8])==[1, 2, 3, 4, 5, 6, 7, 8]);
	}
	
	@Test
	public void test8() {
	  assertTrue(classe.metode([5, 4, 3, 2, 1])== [1, 2, 3, 4, 5]);
	}
	
	@Test
	public void test9() {
	  assertTrue(classe.metode([1])== [1]);
	}
	
	@Test
	public void test10() {
	  assertTrue(classe.metode([2,1])== [1,2]);
	}
	
	@Test
	public void test11() {
	  assertTrue(classe.metode([1,2,3])== [1,2,3]);
	}
	
	@Test
	public void test12() {
	  assertTrue(classe.metode([9, 5, 7, 2, 8])== [2, 5, 7, 8, 9]);
	}
	
	@Test
	public void test13() {
		assertThrows(Excepcio.class, () -> classe.metode(1));
	}
	
	@Test
	public void test14() {
		assertThrows(Excepcio.class, () -> classe.metode(-1));
	}

	@Test
	public void test15() {
		assertThrows(Excepcio.class, () -> classe.metode("a"));
	}

	@Test
	public void test16() {
		assertThrows(Excepcio.class, () -> classe.metode(True));
	}
}


