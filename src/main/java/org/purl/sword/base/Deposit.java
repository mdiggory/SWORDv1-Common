/**
 * Copyright (c) 2007, Aberystwyth University
 *
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions 
 * are met:
 * 
 *  - Redistributions of source code must retain the above 
 *    copyright notice, this list of conditions and the 
 *    following disclaimer.
 *  
 *  - Redistributions in binary form must reproduce the above copyright 
 *    notice, this list of conditions and the following disclaimer in 
 *    the documentation and/or other materials provided with the 
 *    distribution.
 *    
 *  - Neither the name of the Centre for Advanced Software and 
 *    Intelligent Systems (CASIS) nor the names of its 
 *    contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT 
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON 
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR 
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF 
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF 
 * SUCH DAMAGE.
 */
package org.purl.sword.base;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

/**
 * Represents a deposit. 
 * 
 * @author Stuart Lewis 
 */
public class Deposit 
{
   
   /** The File deposited */
   private InputStream file;
   
   /** The content type */
   private String contentType;
   
   /** The content length */
   private int contentLength;
   
   /** The username */
   private String username;
   
   /** The password */
   private String password;
   
   /** The onBehalfOf value */
   private String onBehalfOf;
   
   /** The slug string */
   private String slug;
   
   /** MD5 hash */
   private String md5;
   
   /** True if verbose should be used */
   private boolean verbose;
   
   /** True if this is a no-operation command */
   private boolean noOp;
   
   /** The format namespace */
   private String formatNamespace;
   
   /** Deposit ID */
   private String depositID;
   
   /** The IP Address */
   private String IPAddress;
   
   /** The location */
   private String location;
     
   /** The content disposition */
   private String contentDisposition; 
   
   /**
    * Submission created
    */
   public static final int CREATED = HttpServletResponse.SC_CREATED;
   
   /**
    * Submission accepted.
    */
   public static final int ACCEPTED = HttpServletResponse.SC_ACCEPTED; 

   /**
    * @return the authenticatedUserName
    */
   public String getUsername() {
      return username;
   }

   /**
    * @param authenticatedUserName the authenticatedUserName to set
    */
   public void setUsername(String username) {
      this.username = username;
   }

   /**
    * @return the authenticatedUserPassword
    */
   public String getPassword() {
      return password;
   }

   /**
    * @param password the password to set
    */
   public void setPassword(String password) {
      this.password = password;
   }

   /**
    * @return the contentLength
    */
   public int getContentLength() {
      return contentLength;
   }

   /**
    * @param contentLength the contentLength to set
    */
   public void setContentLength(int contentLength) {
      this.contentLength = contentLength;
   }

   /**
    * @return the contentType
    */
   public String getContentType() {
      return contentType;
   }

   /**
    * @param contentType the contentType to set
    */
   public void setContentType(String contentType) {
      this.contentType = contentType;
   }

   /**
    * @return the depositID
    */
   public String getDepositID() {
      return depositID;
   }

   /**
    * @param depositID the depositID to set
    */
   public void setDepositID(String depositID) {
      this.depositID = depositID;
   }

   /**
    * @return the file
    */
   public InputStream getFile() {
      return file;
   }

   /**
    * @param file the file to set
    */
   public void setFile(InputStream file) {
      this.file = file;
   }

   /**
    * @return the formatNamespace
    */
   public String getFormatNamespace() {
      return formatNamespace;
   }

   /**
    * @param formatNamespace the formatNamespace to set
    */
   public void setFormatNamespace(String formatNamespace) {
      this.formatNamespace = formatNamespace;
   }

   /**
    * @return the md5
    */
   public String getMd5() {
      return md5;
   }

   /**
    * @param md5 the md5 to set
    */
   public void setMd5(String md5) {
      this.md5 = md5;
   }

   /**
    * @return the noOp
    */
   public boolean isNoOp() {
      return noOp;
   }

   /**
    * @param noOp the noOp to set
    */
   public void setNoOp(boolean noOp) {
      this.noOp = noOp;
   }

   /**
    * @return the onBehalfOf
    */
   public String getOnBehalfOf() {
      return onBehalfOf;
   }

   /**
    * @param onBehalfOf the onBehalfOf to set
    */
   public void setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
   }

   /**
    * @return the slug
    */
   public String getSlug() {
      return slug;
   }

   /**
    * @param slug the slug to set
    */
   public void setSlug(String slug) {
      this.slug = slug;
   }

   /**
    * @return the verbose
    */
   public boolean isVerbose() {
      return verbose;
   }

   /**
    * @param verbose the verbose to set
    */
   public void setVerbose(boolean verbose) {
      this.verbose = verbose;
   }
   
   /**
    * Get the IP address of the user
    * 
    * @return the IP address
    */
   public String getIPAddress() {
	   return IPAddress;
   }
   
   /**
    * Set the IP address of the user
    *
    * @param String the IP address
    */
   public void setIPAddress(String IPAddress) {
	   this.IPAddress = IPAddress;
   }
   
   /**
    * Get the location of the deposit
    * 
    * @return the location of the deposit
    */
   public String getLocation() {
	   return location;
   }
   
   /**
    * Set the location of the deposit
    *
    * @param String the location
    */
   public void setLocation(String location) {
	   this.location = location;
   }

   /**
    * Retrieve the filename that is associated with this deposit. This
    * is extracted from the content disposition value.  
    * 
    * @return The filename. 
    */
   public String getFilename() 
   {
	   String filename = null; // default return value
	   if( contentDisposition != null ) 
	   {
		   try
		   {
			   String filePattern = ".*filename=(.*?)((; *.*)|( +)){0,1}";
			   Pattern p = Pattern.compile(filePattern);
			   Matcher m = p.matcher(contentDisposition);

			   if( m.matches() && m.groupCount() > 2 )
			   {
				   filename = m.group(1);
			   }
		   }
		   catch( Exception ex )
		   {
			   ex.printStackTrace();
		   }
	   }
	   return filename; 
   }

   /**
    * Set the content disposition that is to be used for this deposit.  
    * This will include the filename, if specified.  
    *  
    * @param disposition The content disposition value. 
    */
   public void setContentDisposition(String disposition) 
   {
      this.contentDisposition = disposition;
   }
   
   /**
    * Return the content disposition value. 
    * 
    * @return The value. 
    */
   public String getContentDisposition()
   {
	   return this.contentDisposition;
   }
   
}