package train;

public class SeaSideLine {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Train tr = new Train();
		double m;
		long kyori;
		try {
			m = Double.parseDouble(args[0]);
			kyori = (long)m;
			tr.goForward(kyori);
		} catch (ReversePositionException e1) {
			System.out.println("�G���[");
		} catch (Exception e2) {
			System.out.println("���̑��G���[");
		}

	}

}
