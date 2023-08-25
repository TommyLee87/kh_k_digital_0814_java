package 추상클래스2_0825;

// Phone은 인스턴스화 될 수 없음  (abstract)
public abstract class Phone {
    public String name;
    public boolean isPower;
    public Phone(String name) {
        this.name = name;
    }
    public void setPower(boolean isPower) {
        this.isPower = isPower;
        if (isPower) System.out.println("Phone Power ON");
        else System.out.println("Phone Power OFF");
    }
    abstract void call();
}
