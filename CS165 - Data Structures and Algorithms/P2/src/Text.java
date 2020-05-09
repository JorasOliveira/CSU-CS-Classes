public class Text extends Primitive {
    private String text;
    private String name;
    private int size;

    @Override
    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Text(int x, int y, String text){
        setText(text);
        setX(x);
        setY(y);
    }
    public void setFont(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void draw(UserInterface ui){
       ui.textColor(getColor());

        ui.setFont(getName(), getSize());
        ui.drawText(getX(),getY(), getText());
       ;
    }

}
