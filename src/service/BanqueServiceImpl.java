package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1305409733624121042L;

	protected BanqueServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return 11*mt;
	}

	@Override
	public Date GetServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}

}
