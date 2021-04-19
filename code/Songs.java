package Data_Insert;

import java.util.*;

public class Songs {

	List<Songs> newSongs = new ArrayList<>();
	
	private List<String> position = new ArrayList<>();
	private List<String> trackname = new ArrayList<>();
	private List<String> artist = new ArrayList<>();
	private List<String> streams = new ArrayList<>();
	private List<String> url = new ArrayList<>();
	
	public Songs(List<String> position, List<String> trackname, List<String> artist, List<String> streams, List<String> url) {
		super();
		this.position = position;
		this.trackname = trackname;
		this.artist = artist;
		this.streams = streams;
		this.url = url;
	}
	public List<String> getPosition() {
		return position;
	}
	
	public List<String> getTrackname() {
		return trackname;
	}
	public List<String> getArtist() {
		return artist;
	}
	public List<String> getStreams() {
		return streams;
	}
	public List<String> getUrl() {
		return url;
	}
	public void setPosition(List<String> position) {
		this.position = position;
	}
	public void setTrackname(List<String> trackname) {
		this.trackname = trackname;
	}
	public void setArtist(List<String> artist) {
		this.artist = artist;
	}
	public void setStreams(List<String> streams) {
		this.streams = streams;
	}
	public void setUrl(List<String> url) {
		this.url = url;
	}
	
}
