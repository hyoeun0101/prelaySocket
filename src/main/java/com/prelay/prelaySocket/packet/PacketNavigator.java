package com.prelay.prelaySocket.packet;

import com.prelay.prelaySocket.main.IMainProcess;
import io.netty.channel.ChannelHandlerContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PacketNavigator {

    public byte[] exector(ChannelHandlerContext ctx, byte[] inData) {
        IMainProcess mainProcess;
        if(inData.length == 470) {

        } else if (inData.length == 822) {

        } else if(inData.length == 200) {

        }
        return null;
    }
}
