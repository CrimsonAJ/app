.class public final LG0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LG0/n;->a:I

    iput-object p2, p0, LG0/n;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    .line 1
    iget-object v0, p0, LG0/n;->b:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LG0/n;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Connected to SessionLifecycleService. Queue size "

    .line 11
    .line 12
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v0, Lcom/google/firebase/messaging/s;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/firebase/messaging/s;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingDeque;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v1, "SessionLifecycleClient"

    .line 33
    .line 34
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    new-instance p1, Landroid/os/Messenger;

    .line 38
    .line 39
    invoke-direct {p1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v0, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object p2, v0, Lcom/google/firebase/messaging/s;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->drainTo(Ljava/util/Collection;)I

    .line 54
    .line 55
    .line 56
    iget-object p2, v0, Lcom/google/firebase/messaging/s;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, LE7/i;

    .line 59
    .line 60
    invoke-static {p2}, LY7/B;->a(LE7/i;)Ld8/e;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v1, Li7/a0;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-direct {v1, v0, p1, v2}, Li7/a0;-><init>(Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;LE7/d;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x3

    .line 71
    invoke-static {p2, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_0
    const-string v1, "name"

    .line 76
    .line 77
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string p1, "service"

    .line 81
    .line 82
    invoke-static {p2, p1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    sget p1, LG0/p;->f:I

    .line 86
    .line 87
    sget-object p1, LG0/f;->b:Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {p2, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    instance-of v1, p1, LG0/f;

    .line 96
    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    check-cast p1, LG0/f;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    new-instance p1, LG0/e;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object p2, p1, LG0/e;->e:Landroid/os/IBinder;

    .line 108
    .line 109
    :goto_0
    check-cast v0, LG0/o;

    .line 110
    .line 111
    iput-object p1, v0, LG0/o;->g:LG0/f;

    .line 112
    .line 113
    :try_start_0
    iget-object p2, v0, LG0/o;->j:LG0/m;

    .line 114
    .line 115
    iget-object v1, v0, LG0/o;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {p1, p2, v1}, LG0/f;->X(LG0/d;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput p1, v0, LG0/o;->f:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catch_0
    move-exception p1

    .line 125
    const-string p2, "ROOM"

    .line 126
    .line 127
    const-string v0, "Cannot register multi-instance invalidation callback"

    .line 128
    .line 129
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 130
    .line 131
    .line 132
    :goto_1
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 134
    .line 135
    .line 136
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
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget v0, p0, LG0/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p1, "SessionLifecycleClient"

    .line 7
    .line 8
    const-string v0, "Disconnected from SessionLifecycleService"

    .line 9
    .line 10
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LG0/n;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/firebase/messaging/s;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p1, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    const-string v0, "name"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LG0/n;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LG0/o;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p1, LG0/o;->g:LG0/f;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 38
.end method
