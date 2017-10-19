/*
 * Copyright 2014-2017 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.smartim.callback;

import cn.ieclipse.smartim.model.impl.AbstractFrom;
import cn.ieclipse.smartim.model.impl.AbstractMessage;

/**
 * 接收信息时的回调
 * 
 * @author Jamling
 * @date 2017年9月1日
 *       
 */
public interface ReceiveCallback {
    /**
     * 接收到新消息
     * 
     * @param message
     *            消息对象
     * @param from
     *            消息发送者（有可能为null）
     */
    void onReceiveMessage(AbstractMessage message, AbstractFrom from);
    
    /**
     * 接收到错误
     * 
     * @param e
     *            异常信息
     */
    void onReceiveError(Throwable e);
}
