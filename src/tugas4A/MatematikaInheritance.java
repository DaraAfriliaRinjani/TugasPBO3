package tugas4A;

public class MatematikaInheritance {
    public static void main(String[] args) {
		Matematika2 mtk2 = new Matematika2();
		Matematika mtk = new Matematika();
		
		System.out.println("pertambahan :" + mtk.pertambahan(20, 10));
		System.out.println("pengurangan :" + mtk.pengurangan(10, 5));
		System.out.println("perkalian :" + mtk.perkalian(10, 3));
		System.out.println("pertambahan :" + mtk.pembagian(20, 2));
		System.out.println("Hasil modulus :" + mtk2.modulus(20, 3));
    }
    
}
