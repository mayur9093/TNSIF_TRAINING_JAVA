package TNSIFJAVA.src.org.tnsif.acc.c2tc.MultipleInterface;

 class smartPhone implements camera,musicPlayer {

    @Override
    public void Takephoto() {
        System.out.println("Taking photo");
    }
    @Override
    public void play() {
        System.out.println("Playing music");
    }
    @Override
    public void pause() {
        System.out.println("Pausing music");
    }


        public static void main(String[] args) {
            smartPhone p = new smartPhone();
            p.Takephoto();
            p.play();
            p.pause();
        }
}
