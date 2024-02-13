package exam2;

public class ColorTv extends Tv {

  private int color;

  public ColorTv(int size, int color) {
    super(size);
    this.color = color;
  }

  public void printProperty() {
    System.out.printf("실행 결과 :  %d 인치  %d 컬러", getSize(), color);
  }

  public int getColor() {
    return color;
  }
}
