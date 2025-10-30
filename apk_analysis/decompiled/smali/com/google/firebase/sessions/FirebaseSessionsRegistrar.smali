.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final Companion:Li7/x;

.field public static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "FirebaseSessions"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final appContext:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field

.field private static final backgroundDispatcher:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field

.field private static final firebaseApp:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field

.field private static final firebaseSessionsComponent:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field

.field private static final transportFactory:Ls6/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/p;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li7/x;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Li7/x;

    .line 7
    .line 8
    const-class v0, Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0}, Ls6/p;->a(Ljava/lang/Class;)Ls6/p;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Ls6/p;

    .line 15
    .line 16
    const-class v0, Ll6/f;

    .line 17
    .line 18
    invoke-static {v0}, Ls6/p;->a(Ljava/lang/Class;)Ls6/p;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ls6/p;

    .line 23
    .line 24
    const-class v0, LT6/e;

    .line 25
    .line 26
    invoke-static {v0}, Ls6/p;->a(Ljava/lang/Class;)Ls6/p;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ls6/p;

    .line 31
    .line 32
    new-instance v0, Ls6/p;

    .line 33
    .line 34
    const-class v1, Lr6/a;

    .line 35
    .line 36
    const-class v2, LY7/v;

    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ls6/p;

    .line 42
    .line 43
    new-instance v0, Ls6/p;

    .line 44
    .line 45
    const-class v1, Lr6/b;

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ls6/p;

    .line 51
    .line 52
    const-class v0, LV2/f;

    .line 53
    .line 54
    invoke-static {v0}, Ls6/p;->a(Ljava/lang/Class;)Ls6/p;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ls6/p;

    .line 59
    .line 60
    const-class v0, Li7/s;

    .line 61
    .line 62
    invoke-static {v0}, Ls6/p;->a(Ljava/lang/Class;)Ls6/p;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Ls6/p;

    .line 67
    .line 68
    :try_start_0
    sget v0, Li7/w;->a:I
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    return-void

    .line 71
    :catch_0
    const-string v0, "FirebaseSessions"

    .line 72
    .line 73
    const-string v1, "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3"

    .line 74
    .line 75
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    return-void
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic a(LY2/r;)Li7/s;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(Ls6/c;)Li7/s;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAppContext$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getBackgroundDispatcher$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getBlockingDispatcher$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getFirebaseApp$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getFirebaseInstallationsApi$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getFirebaseSessionsComponent$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final synthetic access$getTransportFactory$cp()Ls6/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ls6/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static synthetic b(LY2/r;)Li7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(Ls6/c;)Li7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(Ls6/c;)Li7/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Ls6/p;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Li7/s;

    .line 8
    .line 9
    check-cast p0, Li7/i;

    .line 10
    .line 11
    iget-object p0, p0, Li7/i;->i:Lz7/a;

    .line 12
    .line 13
    invoke-interface {p0}, Lz7/a;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Li7/p;

    .line 18
    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method private static final getComponents$lambda$1(Ls6/c;)Li7/s;
    .locals 12

    .line 1
    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Ls6/p;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "container[appContext]"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ls6/p;

    .line 15
    .line 16
    invoke-interface {p0, v1}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "container[backgroundDispatcher]"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v1, LE7/i;

    .line 26
    .line 27
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ls6/p;

    .line 28
    .line 29
    invoke-interface {p0, v2}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "container[blockingDispatcher]"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast v2, LE7/i;

    .line 39
    .line 40
    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ls6/p;

    .line 41
    .line 42
    invoke-interface {p0, v2}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "container[firebaseApp]"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast v2, Ll6/f;

    .line 52
    .line 53
    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ls6/p;

    .line 54
    .line 55
    invoke-interface {p0, v3}, Ls6/c;->d(Ls6/p;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v4, "container[firebaseInstallationsApi]"

    .line 60
    .line 61
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v3, LT6/e;

    .line 65
    .line 66
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ls6/p;

    .line 67
    .line 68
    invoke-interface {p0, v4}, Ls6/c;->i(Ls6/p;)LS6/b;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v4, "container.getProvider(transportFactory)"

    .line 73
    .line 74
    invoke-static {p0, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Li7/i;

    .line 78
    .line 79
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v2}, Ll7/c;->a(Ljava/lang/Object;)Ll7/c;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iput-object v2, v4, Li7/i;->a:Ll7/c;

    .line 87
    .line 88
    invoke-static {v0}, Ll7/c;->a(Ljava/lang/Object;)Ll7/c;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, v4, Li7/i;->b:Ll7/c;

    .line 93
    .line 94
    new-instance v2, Li7/m;

    .line 95
    .line 96
    const/4 v5, 0x5

    .line 97
    invoke-direct {v2, v0, v5}, Li7/m;-><init>(Lz7/a;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, v4, Li7/i;->c:Lz7/a;

    .line 105
    .line 106
    invoke-static {v1}, Ll7/c;->a(Ljava/lang/Object;)Ll7/c;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, v4, Li7/i;->d:Ll7/c;

    .line 111
    .line 112
    invoke-static {v3}, Ll7/c;->a(Ljava/lang/Object;)Ll7/c;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, v4, Li7/i;->e:Ll7/c;

    .line 117
    .line 118
    iget-object v0, v4, Li7/i;->a:Ll7/c;

    .line 119
    .line 120
    new-instance v1, Li7/m;

    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    invoke-direct {v1, v0, v2}, Li7/m;-><init>(Lz7/a;I)V

    .line 124
    .line 125
    .line 126
    invoke-static {v1}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, v4, Li7/i;->f:Lz7/a;

    .line 131
    .line 132
    iget-object v1, v4, Li7/i;->d:Ll7/c;

    .line 133
    .line 134
    new-instance v2, Li7/L;

    .line 135
    .line 136
    invoke-direct {v2, v0, v1}, Li7/L;-><init>(Lz7/a;Ll7/c;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v2}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, v4, Li7/i;->g:Lz7/a;

    .line 144
    .line 145
    iget-object v0, v4, Li7/i;->b:Ll7/c;

    .line 146
    .line 147
    new-instance v1, Li7/m;

    .line 148
    .line 149
    const/4 v2, 0x2

    .line 150
    invoke-direct {v1, v0, v2}, Li7/m;-><init>(Lz7/a;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    new-instance v1, Li7/m;

    .line 158
    .line 159
    const/4 v2, 0x6

    .line 160
    invoke-direct {v1, v0, v2}, Li7/m;-><init>(Lz7/a;I)V

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    iget-object v6, v4, Li7/i;->d:Ll7/c;

    .line 168
    .line 169
    iget-object v7, v4, Li7/i;->e:Ll7/c;

    .line 170
    .line 171
    iget-object v8, v4, Li7/i;->f:Lz7/a;

    .line 172
    .line 173
    iget-object v9, v4, Li7/i;->g:Lz7/a;

    .line 174
    .line 175
    new-instance v5, Li7/U;

    .line 176
    .line 177
    const/4 v11, 0x1

    .line 178
    invoke-direct/range {v5 .. v11}, Li7/U;-><init>(Ll7/c;Ll7/c;Lz7/a;Lz7/a;Lz7/a;I)V

    .line 179
    .line 180
    .line 181
    invoke-static {v5}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-object v1, v4, Li7/i;->c:Lz7/a;

    .line 186
    .line 187
    new-instance v2, Li7/W;

    .line 188
    .line 189
    const/4 v3, 0x1

    .line 190
    invoke-direct {v2, v1, v0, v3}, Li7/W;-><init>(Lz7/a;Lz7/a;I)V

    .line 191
    .line 192
    .line 193
    invoke-static {v2}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iput-object v0, v4, Li7/i;->h:Lz7/a;

    .line 198
    .line 199
    iget-object v0, v4, Li7/i;->b:Ll7/c;

    .line 200
    .line 201
    new-instance v1, Li7/m;

    .line 202
    .line 203
    const/4 v2, 0x4

    .line 204
    invoke-direct {v1, v0, v2}, Li7/m;-><init>(Lz7/a;I)V

    .line 205
    .line 206
    .line 207
    invoke-static {v1}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    iget-object v1, v4, Li7/i;->a:Ll7/c;

    .line 212
    .line 213
    iget-object v2, v4, Li7/i;->h:Lz7/a;

    .line 214
    .line 215
    iget-object v3, v4, Li7/i;->d:Ll7/c;

    .line 216
    .line 217
    new-instance v5, Li7/y;

    .line 218
    .line 219
    invoke-direct {v5, v1, v2, v3, v0}, Li7/y;-><init>(Ll7/c;Lz7/a;Ll7/c;Lz7/a;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v5}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iput-object v0, v4, Li7/i;->i:Lz7/a;

    .line 227
    .line 228
    iget-object v0, v4, Li7/i;->b:Ll7/c;

    .line 229
    .line 230
    new-instance v1, Li7/m;

    .line 231
    .line 232
    const/4 v2, 0x3

    .line 233
    invoke-direct {v1, v0, v2}, Li7/m;-><init>(Lz7/a;I)V

    .line 234
    .line 235
    .line 236
    invoke-static {v1}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v1, v4, Li7/i;->d:Ll7/c;

    .line 241
    .line 242
    new-instance v2, Li7/L;

    .line 243
    .line 244
    invoke-direct {v2, v1, v0}, Li7/L;-><init>(Ll7/c;Lz7/a;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iput-object v0, v4, Li7/i;->j:Lz7/a;

    .line 252
    .line 253
    invoke-static {p0}, Ll7/c;->a(Ljava/lang/Object;)Ll7/c;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    new-instance v0, Li7/m;

    .line 258
    .line 259
    const/4 v1, 0x0

    .line 260
    invoke-direct {v0, p0, v1}, Li7/m;-><init>(Lz7/a;I)V

    .line 261
    .line 262
    .line 263
    invoke-static {v0}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    iget-object v6, v4, Li7/i;->a:Ll7/c;

    .line 268
    .line 269
    iget-object v7, v4, Li7/i;->e:Ll7/c;

    .line 270
    .line 271
    iget-object v8, v4, Li7/i;->h:Lz7/a;

    .line 272
    .line 273
    iget-object v10, v4, Li7/i;->d:Ll7/c;

    .line 274
    .line 275
    new-instance v5, Li7/U;

    .line 276
    .line 277
    const/4 v11, 0x0

    .line 278
    invoke-direct/range {v5 .. v11}, Li7/U;-><init>(Ll7/c;Ll7/c;Lz7/a;Lz7/a;Lz7/a;I)V

    .line 279
    .line 280
    .line 281
    invoke-static {v5}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    iput-object p0, v4, Li7/i;->k:Lz7/a;

    .line 286
    .line 287
    sget-object p0, Li7/t;->a:Li7/u;

    .line 288
    .line 289
    invoke-static {p0}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    iput-object p0, v4, Li7/i;->l:Lz7/a;

    .line 294
    .line 295
    sget-object p0, Li7/t;->b:Li7/u;

    .line 296
    .line 297
    invoke-static {p0}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    iget-object v0, v4, Li7/i;->l:Lz7/a;

    .line 302
    .line 303
    new-instance v1, Li7/W;

    .line 304
    .line 305
    const/4 v2, 0x0

    .line 306
    invoke-direct {v1, v0, p0, v2}, Li7/W;-><init>(Lz7/a;Lz7/a;I)V

    .line 307
    .line 308
    .line 309
    invoke-static {v1}, Ll7/a;->a(Ll7/b;)Lz7/a;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    iput-object p0, v4, Li7/i;->m:Lz7/a;

    .line 314
    .line 315
    return-object v4
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls6/b;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const-class v2, Li7/p;

    .line 4
    .line 5
    invoke-static {v2}, Ls6/b;->a(Ljava/lang/Class;)Ls6/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "fire-sessions"

    .line 10
    .line 11
    iput-object v3, v2, Ls6/a;->a:Ljava/lang/String;

    .line 12
    .line 13
    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseSessionsComponent:Ls6/p;

    .line 14
    .line 15
    invoke-static {v4}, Ls6/h;->b(Ls6/p;)Ls6/h;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v2, v4}, Ls6/a;->a(Ls6/h;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, LX0/k;

    .line 23
    .line 24
    const/16 v5, 0x12

    .line 25
    .line 26
    invoke-direct {v4, v5}, LX0/k;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v4, v2, Ls6/a;->f:Ls6/d;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ls6/a;->c(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ls6/a;->b()Ls6/b;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-class v4, Li7/s;

    .line 39
    .line 40
    invoke-static {v4}, Ls6/b;->a(Ljava/lang/Class;)Ls6/a;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "fire-sessions-component"

    .line 45
    .line 46
    iput-object v5, v4, Ls6/a;->a:Ljava/lang/String;

    .line 47
    .line 48
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->appContext:Ls6/p;

    .line 49
    .line 50
    invoke-static {v5}, Ls6/h;->b(Ls6/p;)Ls6/h;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v4, v5}, Ls6/a;->a(Ls6/h;)V

    .line 55
    .line 56
    .line 57
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ls6/p;

    .line 58
    .line 59
    invoke-static {v5}, Ls6/h;->b(Ls6/p;)Ls6/h;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v4, v5}, Ls6/a;->a(Ls6/h;)V

    .line 64
    .line 65
    .line 66
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ls6/p;

    .line 67
    .line 68
    invoke-static {v5}, Ls6/h;->b(Ls6/p;)Ls6/h;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v4, v5}, Ls6/a;->a(Ls6/h;)V

    .line 73
    .line 74
    .line 75
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ls6/p;

    .line 76
    .line 77
    invoke-static {v5}, Ls6/h;->b(Ls6/p;)Ls6/h;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v4, v5}, Ls6/a;->a(Ls6/h;)V

    .line 82
    .line 83
    .line 84
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ls6/p;

    .line 85
    .line 86
    invoke-static {v5}, Ls6/h;->b(Ls6/p;)Ls6/h;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v4, v5}, Ls6/a;->a(Ls6/h;)V

    .line 91
    .line 92
    .line 93
    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ls6/p;

    .line 94
    .line 95
    new-instance v6, Ls6/h;

    .line 96
    .line 97
    invoke-direct {v6, v5, v0, v0}, Ls6/h;-><init>(Ls6/p;II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v6}, Ls6/a;->a(Ls6/h;)V

    .line 101
    .line 102
    .line 103
    new-instance v5, LX0/k;

    .line 104
    .line 105
    const/16 v6, 0x13

    .line 106
    .line 107
    invoke-direct {v5, v6}, LX0/k;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iput-object v5, v4, Ls6/a;->f:Ls6/d;

    .line 111
    .line 112
    invoke-virtual {v4}, Ls6/a;->b()Ls6/b;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v5, "2.1.2"

    .line 117
    .line 118
    invoke-static {v3, v5}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    const/4 v5, 0x3

    .line 123
    new-array v5, v5, [Ls6/b;

    .line 124
    .line 125
    const/4 v6, 0x0

    .line 126
    aput-object v2, v5, v6

    .line 127
    .line 128
    aput-object v4, v5, v0

    .line 129
    .line 130
    aput-object v3, v5, v1

    .line 131
    .line 132
    invoke-static {v5}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method
