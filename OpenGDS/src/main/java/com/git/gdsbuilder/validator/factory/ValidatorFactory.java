package com.git.gdsbuilder.validator.factory;

import java.util.Map;
import java.util.Vector;

import org.geotools.feature.SchemaException;
import org.json.simple.JSONArray;
import org.opengis.feature.simple.SimpleFeature;

public interface ValidatorFactory {
	/**
	 * 검수 종류 중 “허용범위 이하 면적(SmallArea)“ 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param defaultArea
	 *            허용 범위 면적
	 * @return SimpleFeature
	 * @throws SchemaException
	 */
	Map<String, Object> smallArea(SimpleFeature simpleFeatureI, double defaultArea) throws SchemaException;

	/**
	 * 검수 종류 중 “허용범위 이하 길이(SmallLength)“ 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param defaultLength
	 *            허용 범위 길이
	 * @return SimpleFeature
	 * @throws SchemaException
	 */
	Map<String, Object> smallLength(SimpleFeature simpleFeatureI, double defaultLength) throws SchemaException;

	/**
	 * 검수 종류 중 “요소 중복 오류(Entity Duplicaated)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param simpleFeatureJ
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Map<String, Object> entityDuplicated(SimpleFeature simpleFeatureI, SimpleFeature simpleFeatureJ) throws SchemaException;

	/**
	 * 검수 종류 중 “중복점오류(Duplicated Point)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeature
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Map<String, Object> pointDuplicated(SimpleFeature simpleFeature) throws SchemaException;

	/**
	 * 검수 종류 중 LineString 또는 MultiLineString 타입 SimpleFeature의 “단독 존재 오류 (Self
	 * Entity)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param simpleFeatureJ
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Vector<SimpleFeature> selfEntity4Line(SimpleFeature simpleFeatureI, SimpleFeature simpleFeatureJ) throws SchemaException;

	/**
	 * 검수 종류 중 Polygon 또는 MultiPolygon 타입 SimpleFeature의 “단독 존재 오류 (Self
	 * Entity)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param simpleFeatureJ
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Vector<SimpleFeature> selfEntity4Polygon(SimpleFeature simpleFeatureI, SimpleFeature simpleFeatureJ) throws SchemaException;

	/**
	 * 검수 종류 중 Point 또는 MultiPoint 타입 SimpleFeature의 “단독 존재 오류 (Self Entity)” 검수
	 * 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param simpleFeatureJ
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Vector<SimpleFeature> selfEntity4Point(SimpleFeature simpleFeatureI, SimpleFeature simpleFeatureJ) throws SchemaException;

	/**
	 * 검수 종류 중 LineString 또는 MultiLineString 타입 SimpleFeature의 “등고선 교차 오류(Con
	 * Intersected)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeatureI
	 *            검수를 수행할 SimpleFeature
	 * @param simpleFeatureJ
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Map<String, Object> conIntersected(SimpleFeature simpleFeatureI, SimpleFeature simpleFeatureJ) throws SchemaException;

	/**
	 * 검수 종류 중 LineString 또는 MultiLineString 타입 SimpleFeature의 “등고선 꺾임 오류(Con
	 * Over Degree)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeature
	 *            검수를 수행할 SimpleFeature
	 * @param doubledfdegree
	 *            각도
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Map<String, Object> conOverDegree(SimpleFeature simpleFeature, double doubledfdegree) throws SchemaException;

	/**
	 * 검수 종류 중 LineString 또는 MultiLineString 타입 SimpleFeature의 “등고선 끊김 오류(Con
	 * Break)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeature
	 *            검수를 수행할 SimpleFeature
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Map<String, Object> conBreak(SimpleFeature simpleFeature) throws SchemaException;

	/**
	 * 검수 종류 중 “필수 속성 오류(Attribute Fix)” 검수 결과를 반환한다.
	 * 
	 * @author dayeon.oh
	 * @data 2016.02
	 * @param simpleFeature
	 *            검수를 수행할 SimpleFeature
	 * @param attributes
	 *            필수 속성의 key 값과 value Type을 담고 있는 JSONObject
	 * @return Vector<SimpleFeature>
	 * @throws SchemaException
	 */
	Map<String, Object> attributeFix(SimpleFeature simpleFeature, JSONArray attributes) throws SchemaException;

}
