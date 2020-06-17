package proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        target.teach();
        System.out.println("提交...");
    }
}
