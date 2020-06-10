package guessing_game;

public class Game {

	private Player player;

	private Referee referee;

	private Turn turn;

	public void start() {
		//�J�[�h�X�^�b�N�̐���
		CardStack stack = new CardStack();
		
		//�v���C���[�̐���
		player = new Player("A");
		
		//�R���̑I��
		while(true) {
			int refNum = player.selectReferee();
		if(refNum == 1) {
			referee = new StrictReferee(stack);
			break;
		}if(refNum == 2) {
			referee = new GentleReferee(stack);
			break;
		}else {
			System.out.println("1��2�̐�������͂��Ă�������");
		}
		}
		
		//�����̃J�[�h�̐ݒ�
		referee.setAnswerCard();
		
		boolean judgement = false;
		
		
		while(judgement == false) {
		//�^�[���̐���
		turn = new Turn(player);
			//�����A�X�[�g�̓���
		boolean canSelect = false;
		while(canSelect == false) {
		canSelect = turn.requestCard();
		}
		//����
		Card card = turn.getCard();
		judgement = referee.judge(card);
		}
		}
		
	}

}
