package DesignPattern.Behavior.Iterator.FarmlandManagement;

import Model.Farmland;
import Model.Plant.Plant;
import Util.MyUtils;

import java.util.Vector;

/**
 * 使用了迭代器模式
 * 农地容器类，提供获得迭代器、一键收割作物、种植作物的方法
 */
public class FarmlandSet  implements Container {
    public Vector<Vector<Farmland>> landMap;

    /**
     * 构造函数
     * @param size 容器中土地块的维度，size*size个Farmland
     */
    public FarmlandSet(int size ){
        this.landMap =  new Vector<>(size);
        for(int i =0;i<size;i++){
            landMap.add(new Vector<Farmland>(size));
            for(int j = 0;j<size;j++){
                landMap.get(i).add(new Farmland());
            }
        }
    }
    @Override
    public FarmlandIteratorAndProxy getIterator() {
        return new FarmlandIteratorAndProxy(landMap);
    }

    /**
     * 一键收割所有农地上的作物
     */
    public void reapAllFarmland(){
        FarmlandIteratorAndProxy ite = getIterator();
        ite.current().reapCrop();
        while(ite.hasNext()){
            ite.next().reapCrop();
        }
    }

    /**
     * 显示所有农地的信息
     */
    public void showAllFarmland(){
        MyUtils.getModifierString(this,null,"showAllFarmland");
        FarmlandIteratorAndProxy ite = getIterator();
        while(true){
            ite.current().show();
            if(ite.hasNext()) {
                ite.next();
            }else{
                break;
            }
        }
    }

    public Plant getPlantByLandId(int id){
        FarmlandIteratorAndProxy ite = getIterator();
        while(true){
            if(ite.current().landId == id){
                return ite.current().crop;
            }
            if(ite.hasNext()) {
                ite.next();
            }else{
                break;
            }
        }
        return null;
    }

    /**
     * 种植作物
     * @param plant 作物实例
     * @return 是否种植成功
     */
    public boolean plant(Plant plant){
        FarmlandIteratorAndProxy ite = getIterator();
        while(!ite.current().plantCrop(plant)){
            if(!ite.hasNext())
                return false;
            else
                ite.next();
        }
        return true;
    }

}
