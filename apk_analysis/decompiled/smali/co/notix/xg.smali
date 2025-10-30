.class public final Lco/notix/xg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/native/NotixNative;


# instance fields
.field public final a:Lco/notix/j3;

.field public final b:Lco/notix/ia;

.field public final c:Lco/notix/y8;


# direct methods
.method public constructor <init>(Lco/notix/j3;Lco/notix/d9;Lco/notix/ia;)V
    .locals 1

    const-string v0, "adLoaderDelegateFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/xg;->a:Lco/notix/j3;

    iput-object p3, p0, Lco/notix/xg;->b:Lco/notix/ia;

    iput-object p2, p0, Lco/notix/xg;->c:Lco/notix/y8;

    return-void
.end method


# virtual methods
.method public final a(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/ke;
    .locals 11

    new-instance v0, Lco/notix/ke;

    iget-object v1, p0, Lco/notix/xg;->a:Lco/notix/j3;

    new-instance v2, Lco/notix/w8;

    if-nez p3, :cond_0

    new-instance v3, Lco/notix/domain/RequestVars;

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lco/notix/domain/RequestVars;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v3

    :cond_0
    invoke-direct {v2, p1, p2, p3, p4}, Lco/notix/w8;-><init>(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)V

    invoke-virtual {v1, v2}, Lco/notix/j3;->a(Lco/notix/o4;)Lco/notix/i3;

    move-result-object p1

    invoke-direct {v0, p1}, Lco/notix/ke;-><init>(Lco/notix/i3;)V

    return-object v0
.end method

.method public final click(Lco/notix/native/NativeData;)V
    .locals 4

    .line 1
    const-string v0, "nativeData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/notix/xg;->c:Lco/notix/y8;

    .line 7
    .line 8
    sget-object v1, Lco/notix/f;->d:Lco/notix/f;

    .line 9
    .line 10
    check-cast v0, Lco/notix/d9;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v2, "state"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lco/notix/d9;->b:Lb8/F;

    .line 21
    .line 22
    check-cast v0, Lb8/Q;

    .line 23
    .line 24
    invoke-virtual {v0}, Lb8/Q;->h()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-static {v0, v1}, Lco/notix/d9;->a(Ljava/util/WeakHashMap;Lco/notix/f;)Landroid/app/Activity;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    check-cast p1, Lco/notix/je;

    .line 38
    .line 39
    iget-object p1, p1, Lco/notix/je;->a:Lco/notix/i;

    .line 40
    .line 41
    iget-object p1, p1, Lco/notix/i;->g:Ljava/lang/String;

    .line 42
    .line 43
    const-string v1, "url"

    .line 44
    .line 45
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    new-instance v2, Landroid/content/Intent;

    .line 53
    .line 54
    const-string v3, "android.intent.action.VIEW"

    .line 55
    .line 56
    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :goto_0
    invoke-static {v2}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_1

    .line 73
    .line 74
    check-cast v2, Landroid/content/Intent;

    .line 75
    .line 76
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 77
    .line 78
    const-string v1, "successfully started activity with url: "

    .line 79
    .line 80
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {v0, p1}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    sget-object v1, Lco/notix/md;->a:Lco/notix/kd;

    .line 89
    .line 90
    const-string v2, "couldn\'t start activity with url="

    .line 91
    .line 92
    const-string v3, ", error="

    .line 93
    .line 94
    invoke-static {v2, p1, v3}, Lcom/google/android/gms/internal/measurement/k1;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v1, p1, v0}, Lco/notix/kd;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
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
.end method

.method public final createLoader(J)Lco/notix/native/NativeLoader;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v0}, Lco/notix/xg;->a(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/ke;

    move-result-object p1

    return-object p1
.end method

.method public final createLoader(JLco/notix/domain/RequestVars;)Lco/notix/native/NativeLoader;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lco/notix/xg;->a(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/ke;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/native/NativeLoader;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/notix/xg;->a(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/ke;

    move-result-object p1

    return-object p1
.end method

.method public final createLoader(JLjava/lang/Integer;)Lco/notix/native/NativeLoader;
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, v0, p3}, Lco/notix/xg;->a(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/ke;

    move-result-object p1

    return-object p1
.end method

.method public final trackImpression(Lco/notix/native/NativeData;)V
    .locals 4

    .line 1
    const-string v0, "nativeData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lco/notix/je;

    .line 7
    .line 8
    iget-object p1, p1, Lco/notix/je;->a:Lco/notix/i;

    .line 9
    .line 10
    iget-object p1, p1, Lco/notix/i;->h:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p0, Lco/notix/xg;->b:Lco/notix/ia;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v1, "data"

    .line 18
    .line 19
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lco/notix/ia;->c:LY7/z;

    .line 23
    .line 24
    new-instance v2, Lco/notix/fa;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, v0, p1, v3}, Lco/notix/fa;-><init>(Lco/notix/ia;Ljava/lang/String;LE7/d;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    invoke-static {v1, v3, v2, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
.end method
