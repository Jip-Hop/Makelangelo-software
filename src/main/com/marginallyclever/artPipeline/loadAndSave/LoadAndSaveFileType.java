package com.marginallyclever.artPipeline.loadAndSave;

import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.filechooser.FileNameExtensionFilter;

import com.marginallyclever.makelangeloRobot.MakelangeloRobot;

/**
 * Interface for the service handler
 * @author Admin
 *
 */
public interface LoadAndSaveFileType {
	/**
	 * @return returns a FileNameExtensionFilter with the extensions supported by this filter.
	 */
	public FileNameExtensionFilter getFileNameFilter();

	/**
	 * @return true if this plugin can load data from a stream.
	 */
	public boolean canLoad();
	
	/**
	 * @return true if this plugin can save data to a stream.
	 */
	public boolean canSave();
	
	/**
	 * Checks a string's filename, which includes the file extension, (e.g. foo.jpg).
	 *
	 * @param filename absolute path of file to load.
	 * @return true if this plugin can load this file.
	 */
	public boolean canLoad(String filename);

	/**
	 * Checks a string's filename, which includes the file extension, (e.g. foo.jpg).
	 *
	 * @param filename absolute path of file to save.
	 * @return true if this plugin can save this file.
	 */
	public boolean canSave(String filename);
	
	/**
	 * attempt to load a file into the system from a given stream
	 * @param inputStream source of image
	 * @param robot machine hardware settings to use in loading process
	 * @return true if load successful.
	 */
	public boolean load(InputStream inputStream,MakelangeloRobot robot);
	
	/**
	 * attempt to save makelangelo instructions to a given stream
	 * @param outputStream destination
	 * @param robot machine hardware settings to use in loading process
	 * @return true if save successful.
	 */
	public boolean save(OutputStream outputStream,MakelangeloRobot robot);
}
