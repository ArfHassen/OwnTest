package java7;
import java.util.logging.Logger;

/*
 *--------------------------------------------------------
 * Viamedis
 *--------------------------------------------------------
 * Project     : Viasante.net
 *
 * Copyright Viamedis,  All Rights Reserved.
 *
 * This software is the confidential and proprietary
 * information of Viamedis.
 * You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms
 * of the license agreement you entered into with
 * Viamedis.
 *-------------------------------------------------------- 
 * 
 * Fichier 		:	SystemPropertyDemo.java
 * Créé le 		: 	24 janv. 2018 à 11:00:00
 * Auteur		: 	Viamedis
 * 
 * Description 	:
 * 
 *---------------------------------------------------------
 */

/**
 * A Renseigner.
 * @author  : Viamedis
 * @project : TestProject
 * @package : 
 * @date    : 24 janv. 2018 11:00:00
 */
public class SystemPropertyDemo
{

	private static Logger logger = Logger.getLogger( SystemPropertyDemo.class.getName() );
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		System.out.println( "The user home is : "+System.getProperty( "user.name" ) );
		System.out.println( "The version home is : "+System.getProperty( "java.home" ) );
		System.out.println( "The version java is : "+System.getProperty( "java.version" ) );
		System.out.println( "The version VM implementation is  : "+System.getProperty( "java.vm.name" ) );
		System.out.println( "The User's home directory is : "+System.getProperty( "user.home" ) );
		System.out.println( "The User's current working directory is : "+System.getProperty( "user.dir" ) );
	}

}
