package tv;

class TV {
	private String model;
	private int size;
	private int channel;

	public TV() {

	}

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}

	public void channelUp() {
		for(int channel =1; channel<=11; channel++) {
			if(channel > 10 ) {
				channel= 1;
			}else {
			System.out.println(channel);	
			}
		}
	}

	public void channelDown() {
		for(int channel =11; channel <=1; channel--) {                                
			if(channel < 10 ) {
				channel = 10;
			}else {
			System.out.println(channel);
	}
	}
	}	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

}
