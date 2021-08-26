package CommandPattern;
/**
 * 커맨드 패턴 - 커맨드 패턴을 이용하면 요구 사항을 객체로 캡슐화 할 수 있으며, 매개변수를 써서 여러 가지 다른 요구
 * 사항을 집어넣을 수도 있습니다. 또한 요청 내역을 큐에 저장하거나 로그로 기록 할 수 도 있으며, 작업취소 기능도 지원
 * @author HGLEE
 *
 */
public interface Command {
	public void execute();

}
