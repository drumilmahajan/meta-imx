# Wayland packages

SOC_GPU_TOOLS_WAYLAND_mx6q = " glmark2 mesa-demos weston-examples"
SOC_GPU_TOOLS_WAYLAND_mx6dl = " glmark2 mesa-demos weston-examples"
SOC_GPU_TOOLS_WAYLAND_mx6sx = " glmark2 mesa-demos weston-examples"
SOC_GPU_TOOLS_WAYLAND_mx6sl = " mesa-demos weston-examples"
SOC_GPU_TOOLS_WAYLAND_mx8 = " glmark2 mesa-demos weston-examples"

# XWayland packages

SOC_GPU_TOOLS_XWAYLAND = ""
SOC_GPU_TOOLS_XWAYLAND_mx6q = " gtkperf glmark2 mesa-demos weston-examples xterm"
SOC_GPU_TOOLS_XWAYLAND_mx6dl = " gtkperf glmark2 mesa-demos weston-examples xterm"
SOC_GPU_TOOLS_XWAYLAND_mx6sx = " gtkperf glmark2 mesa-demos weston-examples xterm"
SOC_GPU_TOOLS_XWAYLAND_mx6sl = " gtkperf mesa-demos weston-examples xterm"
SOC_GPU_TOOLS_XWAYLAND_mx8 = " gtkperf glmark2 mesa-demos weston-examples xterm"

# X11 packages

SOC_GPU_TOOLS_X11_mx8 = " mesa-demos glmark2 eglinfo-x11 gtkperf glcompbench"


# OpenCV test apps
# Comment out opencv-samplpes due to blacklist conflict with ffmpeg3
OPENCV_TOOLS_INSTALL = ""
OPENCV_TOOLS_INSTALL_append_mx6 = "opencv-apps opencv-samples"

RDEPENDS_${PN} = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', '${SOC_GPU_TOOLS_XWAYLAND}', \
       bb.utils.contains('DISTRO_FEATURES',         'x11', '${SOC_GPU_TOOLS_X11}', \
       bb.utils.contains('DISTRO_FEATURES',     'wayland', '${SOC_GPU_TOOLS_WAYLAND}', \
                                                           '${SOC_GPU_TOOLS_FB}', d), d), d)} \
    ${OPENCV_TOOLS_INSTALL} \
"
