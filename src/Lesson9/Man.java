package Lesson9;

public class Man {

    private String noseSize;
    private String eyesColor;
    private String haircut;
    private int dnaCode;

    public Man(String noseSize, String eyesColor, String haircut, int dnaCode){
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.dnaCode = dnaCode;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    public String getHaircut() {
        return haircut;
    }

    public String getNoseSize() {
        return noseSize;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        Man man = (Man) obj;
        return dnaCode == man.getDnaCode();
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }
}
