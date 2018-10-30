using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Whodb.Android.RNWhodbAndroid
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNWhodbAndroidModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNWhodbAndroidModule"/>.
        /// </summary>
        internal RNWhodbAndroidModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNWhodbAndroid";
            }
        }
    }
}
