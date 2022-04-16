
public class ImageShow extends{
	public void paintComponent(graphic g){
		public HorseAnimate(){
			try{
				img = ImageIO.read(new File("HorseSheet.png"));
			}catch(IOException e){
				System.out.println("no file");
			}
		}
		images = new BufferedImage[4*4];
		int i = 0;
		for (int k = 0; k < 4; k++) for (int j = 0; j < 4; j++){
			int x = 67, y =46;
			images[i++] = img.getSubimage(k*x,j*y,x,y);
		}
		timer = new Timer (100,new TimerCallback());//100ms = 0.1sec
		timer.start();
			
	}

}
