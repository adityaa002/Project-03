package in.co.rays.model;

import java.util.List;

import in.co.rays.dto.RoleDTO;

public interface RoleModelInt {
	public long add(RoleDTO dto);

	public void update(RoleDTO dto);

	public void delete(RoleDTO dto);

	public List list(int pageNo, int pageSize);

	public List list();

	public List search(RoleDTO dto, int pageNo, int pageSize);

	public List search(RoleDTO dto);

	public RoleDTO findByPk(long id);

	public RoleDTO findByName(String name);

}
