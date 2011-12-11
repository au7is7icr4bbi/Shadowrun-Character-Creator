/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import charCreator.*;
import java.util.Vector;

/**
 *
 * @author andrew
 */
public class CreatorController 
{
	private Vector<metatype> metas;
	private Vector<Skill> skills;
	
	public void addMeta(metatype meta)
	{
		metas.add(meta);
	}
	
	public void addSkill(Skill skill)
	{
		skills.add(skill);
	}
	
	public metatype getMeta(int index)
	{
		return metas.get(index);
	}
	
	public String getMetaText(int index)
	{
		return metas.get(index).getName();
	}
	
	public Skill getSkill(int index)
	{
		return skills.get(index);
	}
	
	public String getSkillText(int index)
	{
		return skills.get(index).getName();
	}
	
	public int getNumMetas()
	{
		return metas.size();
	}
	
	public int getNumSkills()
	{
		return skills.size();
	}
}
