package org.openmrs.module;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ModuleTestData {
	
	private Map<String, Integer> willRefreshContextCallCount = new HashMap<String, Integer>();
	
	private Map<String, Integer> contextRefreshedCallCount = new HashMap<String, Integer>();
	
	private Map<String, Integer> willStartCallCount = new HashMap<String, Integer>();
	
	private Map<String, Integer> startedCallCount = new HashMap<String, Integer>();
	
	private Map<String, Integer> willStopCallCount = new HashMap<String, Integer>();
	
	private Map<String, Integer> stoppedCallCount = new HashMap<String, Integer>();
	
	private Map<String, Long> willRefreshContextCallTime = new HashMap<String, Long>();
	
	private Map<String, Long> contextRefreshedCallTime = new HashMap<String, Long>();
	
	private Map<String, Long> willStartCallTime = new HashMap<String, Long>();
	
	private Map<String, Long> startedCallTime = new HashMap<String, Long>();
	
	private Map<String, Long> willStopCallTime = new HashMap<String, Long>();
	
	private Map<String, Long> stoppedCallTime = new HashMap<String, Long>();
	
	private ModuleTestData() {
		
	}
	
	private static class ModuleTestDataHolder {
		
		private static final ModuleTestData INSTANCE = new ModuleTestData();
	}
	
	public static ModuleTestData getInstance() {
		return ModuleTestDataHolder.INSTANCE;
	}
	
	public synchronized void init(String moduleId) {
		willRefreshContextCallCount.put(moduleId, 0);
		contextRefreshedCallCount.put(moduleId, 0);
		willStartCallCount.put(moduleId, 0);
		startedCallCount.put(moduleId, 0);
		willStopCallCount.put(moduleId, 0);
		stoppedCallCount.put(moduleId, 0);
		
		willRefreshContextCallTime.put(moduleId, 0l);
		contextRefreshedCallTime.put(moduleId, 0l);
		willStartCallTime.put(moduleId, 0l);
		startedCallTime.put(moduleId, 0l);
		willStopCallTime.put(moduleId, 0l);
		stoppedCallTime.put(moduleId, 0l);
	}
	
	public synchronized Integer getWillRefreshContextCallCount(String moduleId) {
		Integer count = willRefreshContextCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	public synchronized Integer getContextRefreshedCallCount(String moduleId) {
		Integer count = contextRefreshedCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	public synchronized Integer getWillStartCallCount(String moduleId) {
		Integer count = willStartCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	public synchronized Integer getStartedCallCount(String moduleId) {
		Integer count = startedCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	public synchronized Integer getWillStopCallCount(String moduleId) {
		Integer count = willStopCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	public synchronized Integer getStoppedCallCount(String moduleId) {
		Integer count = stoppedCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		return count;
	}
	
	public synchronized void willRefreshContext(String moduleId) {
		willRefreshContextCallTime.put(moduleId, new Date().getTime());
		
		Integer count = willRefreshContextCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		willRefreshContextCallCount.put(moduleId, count + 1);
	}
	
	public synchronized void contextRefreshed(String moduleId) {
		contextRefreshedCallTime.put(moduleId, new Date().getTime());
		
		Integer count = contextRefreshedCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		contextRefreshedCallCount.put(moduleId, count + 1);
	}
	
	public synchronized void willStart(String moduleId) {
		willStartCallTime.put(moduleId, new Date().getTime());
		
		Integer count = willStartCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		willStartCallCount.put(moduleId, count + 1);
	}
	
	public synchronized void started(String moduleId) {
		startedCallTime.put(moduleId, new Date().getTime());
		
		Integer count = startedCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		startedCallCount.put(moduleId, count + 1);
	}
	
	public synchronized void willStop(String moduleId) {
		willStopCallTime.put(moduleId, new Date().getTime());
		
		Integer count = willStopCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		willStopCallCount.put(moduleId, count + 1);
	}
	
	public synchronized void stopped(String moduleId) {
		stoppedCallTime.put(moduleId, new Date().getTime());
		
		Integer count = stoppedCallCount.get(moduleId);
		if (count == null) {
			count = 0;
		}
		stoppedCallCount.put(moduleId, count + 1);
	}
	
	public synchronized Long getWillRefreshContextCallTime(String moduleId) {
		return willRefreshContextCallTime.get(moduleId);
	}
	
	public synchronized Long getContextRefreshedCallTime(String moduleId) {
		return contextRefreshedCallTime.get(moduleId);
	}
	
	public synchronized Long getWillStartCallTime(String moduleId) {
		return willStartCallTime.get(moduleId);
	}
	
	public synchronized Long getStartedCallTime(String moduleId) {
		return startedCallTime.get(moduleId);
	}
	
	public synchronized Long getWillStopCallTime(String moduleId) {
		return willStopCallTime.get(moduleId);
	}
	
	public synchronized Long getStoppedCallTime(String moduleId) {
		return stoppedCallTime.get(moduleId);
	}
}