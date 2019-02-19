package topic3.assignment3;

import java.util.List;
import java.util.Map;

public class Album 
{
	private int albumid;
	private String aname;
	private Map<String,List<String>> photos;
	public Album() {}
	public Album(int albumid, String aname, Map<String, List<String>> photos) {
		super();
		this.albumid = albumid;
		this.aname = aname;
		this.photos = photos;
	}
	public int getAlbumid() {
		return albumid;
	}
	public void setAlbumid(int albumid) {
		this.albumid = albumid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Map<String, List<String>> getPhotos() {
		return photos;
	}
	public void setPhotos(Map<String, List<String>> photos) {
		this.photos = photos;
	}
}
