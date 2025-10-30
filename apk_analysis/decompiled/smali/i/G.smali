.class public final Li/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/b;
.implements Li6/h;
.implements Lm4/q;
.implements Lo/w;
.implements Lp/o;
.implements Lq5/h;
.implements Lf5/e;
.implements Lf5/c;
.implements Lw5/g;
.implements LD4/l;
.implements Lf5/g;
.implements Lz8/g;
.implements Lz8/f;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Li/G;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 11
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 12
    const-string v0, "timeUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance p1, Lb5/W;

    .line 14
    sget-object v0, Lm8/c;->h:Lm8/c;

    .line 15
    invoke-direct {p1, v0}, Lb5/W;-><init>(Lm8/c;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Li/G;->b:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, LA4/r;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, LA4/r;-><init>(I)V

    iput-object p1, p0, Li/G;->b:Ljava/lang/Object;

    return-void

    .line 20
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Li/G;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li/G;->a:I

    iput-object p2, p0, Li/G;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Li/G;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object p1

    iput-object p1, p0, Li/G;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/cast/MediaInfo;)V
    .locals 13

    const/16 v0, 0xf

    iput v0, p0, Li/G;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lt4/n;

    const-wide/high16 v7, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    const-wide/16 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/high16 v5, 0x7ff8000000000000L    # Double.NaN

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v2, p1

    .line 4
    invoke-direct/range {v1 .. v12}, Lt4/n;-><init>(Lcom/google/android/gms/cast/MediaInfo;IZDDD[JLjava/lang/String;)V

    if-eqz v2, :cond_0

    .line 5
    iput-object v1, p0, Li/G;->b:Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "media cannot be null."

    .line 7
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Li/G;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt4/n;

    invoke-direct {v0, p1}, Lt4/n;-><init>(Lorg/json/JSONObject;)V

    iput-object v0, p0, Li/G;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly4/r;[Ljava/lang/String;)V
    .locals 0

    const/16 p1, 0x16

    iput p1, p0, Li/G;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li/G;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public G(Lf5/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu4/j;

    .line 4
    .line 5
    iget-object v0, v0, Lu4/j;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lu4/d;

    .line 8
    .line 9
    const-string v1, "joinApplication"

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lu4/d;->e(Lu4/d;Ljava/lang/String;Lf5/h;)V

    .line 12
    .line 13
    .line 14
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public H(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ly4/s;

    .line 2
    .line 3
    check-cast p2, Lf5/i;

    .line 4
    .line 5
    new-instance v0, Ly4/q;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1, p2}, Ly4/q;-><init>(ILf5/i;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p1, LF4/e;->c:Landroid/content/Context;

    .line 12
    .line 13
    new-instance p2, LC4/g;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, -0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {p2, v2, v2, v3, v1}, LC4/g;-><init>(IIIZ)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ly4/j;

    .line 26
    .line 27
    new-instance v1, LC4/f;

    .line 28
    .line 29
    invoke-direct {v1, p2}, LC4/f;-><init>(LC4/g;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, LS4/a;->Q()Landroid/os/Parcel;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/cast/C;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, [Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p2, v1}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x7

    .line 50
    invoke-virtual {p1, p2, v0}, LS4/a;->i1(Landroid/os/Parcel;I)V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
    .line 109
    .line 110
    .line 111
    .line 112
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
.end method

.method public a(Lz8/y;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lz8/h;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lz8/h;-><init>(Lz8/y;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/firebase/messaging/u;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lz8/y;->d(Lz8/g;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public b(Lj2/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/WindowManager;

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Lj2/b;->a(Landroid/view/Display;)V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public c(Lo/l;Z)V
    .locals 2

    .line 1
    instance-of v0, p1, Lo/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lo/D;

    .line 7
    .line 8
    iget-object v0, v0, Lo/D;->z:Lo/l;

    .line 9
    .line 10
    invoke-virtual {v0}, Lo/l;->k()Lo/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lo/l;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lp/l;

    .line 21
    .line 22
    iget-object v0, v0, Lp/l;->e:Lo/w;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lo/w;->c(Lo/l;Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public d(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v2, v1, [Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [Ljava/lang/String;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    new-array p1, p1, [I

    .line 30
    .line 31
    move v2, v1

    .line 32
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ge v2, v3, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    move v3, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const/4 v3, -0x1

    .line 53
    :goto_1
    aput v3, p1, v2

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Li/G;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Li0/M;

    .line 61
    .line 62
    iget-object v0, p1, Li0/M;->D:Ljava/util/ArrayDeque;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Li0/H;

    .line 69
    .line 70
    const-string v1, "FragmentManager"

    .line 71
    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v0, "No permissions were requested for "

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    iget-object p1, p1, Li0/M;->c:Ll1/g;

    .line 93
    .line 94
    iget-object v0, v0, Li0/H;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Ll1/g;->k(Ljava/lang/String;)Li0/v;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-nez p1, :cond_3

    .line 101
    .line 102
    new-instance p1, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "Permission request result delivered for unknown Fragment "

    .line 105
    .line 106
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_3
    return-void
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

.method public e(Lz8/d;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, Li/G;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p2, p0, Li/G;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, LY7/h;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, LY7/h;->resumeWith(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p1, p0, Li/G;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lz8/h;

    .line 26
    .line 27
    invoke-static {p1, p2}, Ls8/a;->e(Lz8/h;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public f(Lcom/google/android/material/chip/ChipGroup;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iget-object p1, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/chip/ChipGroup;

    .line 4
    .line 5
    iget-object p2, p1, Lcom/google/android/material/chip/ChipGroup;->h:Lw5/a;

    .line 6
    .line 7
    iget-boolean p2, p2, Lw5/a;->d:Z

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/material/chip/ChipGroup;->getCheckedChipId()I

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    throw p1
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public g(Lz8/d;Lz8/O;)V
    .locals 1

    .line 1
    iget v0, p0, Li/G;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "call"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Li/G;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LY7/h;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, LY7/h;->resumeWith(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object p1, p2, Lz8/O;->a:Li8/L;

    .line 20
    .line 21
    invoke-virtual {p1}, Li8/L;->g()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lz8/h;

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p2, Lz8/O;->b:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v0, p1}, Ls8/a;->d(Lz8/h;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Lz8/o;

    .line 38
    .line 39
    invoke-direct {p1, p2}, Lz8/o;-><init>(Lz8/O;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, p1}, Ls8/a;->f(Lz8/h;Lz8/o;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public i(IILq3/g;)V
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    iget-object v4, v3, Li/G;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v5, v4

    .line 12
    check-cast v5, Lw3/d;

    .line 13
    .line 14
    iget-object v4, v5, Lw3/d;->c:Landroid/util/SparseArray;

    .line 15
    .line 16
    const/4 v6, 0x4

    .line 17
    const/4 v7, 0x2

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    const/16 v8, 0xa1

    .line 21
    .line 22
    const/16 v9, 0xa3

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    if-eq v0, v8, :cond_b

    .line 26
    .line 27
    if-eq v0, v9, :cond_b

    .line 28
    .line 29
    const/16 v8, 0xa5

    .line 30
    .line 31
    if-eq v0, v8, :cond_8

    .line 32
    .line 33
    const/16 v4, 0x41ed

    .line 34
    .line 35
    if-eq v0, v4, :cond_5

    .line 36
    .line 37
    const/16 v4, 0x4255

    .line 38
    .line 39
    if-eq v0, v4, :cond_4

    .line 40
    .line 41
    const/16 v4, 0x47e2

    .line 42
    .line 43
    if-eq v0, v4, :cond_3

    .line 44
    .line 45
    const/16 v4, 0x53ab

    .line 46
    .line 47
    if-eq v0, v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x63a2

    .line 50
    .line 51
    if-eq v0, v4, :cond_1

    .line 52
    .line 53
    const/16 v4, 0x7672

    .line 54
    .line 55
    if-ne v0, v4, :cond_0

    .line 56
    .line 57
    invoke-virtual {v5, v0}, Lw3/d;->d(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v5, Lw3/d;->u:Lw3/c;

    .line 61
    .line 62
    new-array v4, v1, [B

    .line 63
    .line 64
    iput-object v4, v0, Lw3/c;->v:[B

    .line 65
    .line 66
    invoke-virtual {v2, v4, v12, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v2, "Unexpected id: "

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, v10}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    throw v0

    .line 89
    :cond_1
    invoke-virtual {v5, v0}, Lw3/d;->d(I)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v5, Lw3/d;->u:Lw3/c;

    .line 93
    .line 94
    new-array v4, v1, [B

    .line 95
    .line 96
    iput-object v4, v0, Lw3/c;->k:[B

    .line 97
    .line 98
    invoke-virtual {v2, v4, v12, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    iget-object v0, v5, Lw3/d;->i:LA4/r;

    .line 103
    .line 104
    iget-object v4, v0, LA4/r;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v4, [B

    .line 107
    .line 108
    invoke-static {v4, v12}, Ljava/util/Arrays;->fill([BB)V

    .line 109
    .line 110
    .line 111
    iget-object v4, v0, LA4/r;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, [B

    .line 114
    .line 115
    rsub-int/lit8 v6, v1, 0x4

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v12}, LA4/r;->H(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, LA4/r;->y()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    long-to-int v0, v0

    .line 128
    iput v0, v5, Lw3/d;->w:I

    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    new-array v4, v1, [B

    .line 132
    .line 133
    invoke-virtual {v2, v4, v12, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v0}, Lw3/d;->d(I)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v5, Lw3/d;->u:Lw3/c;

    .line 140
    .line 141
    new-instance v1, Lq3/t;

    .line 142
    .line 143
    invoke-direct {v1, v13, v12, v12, v4}, Lq3/t;-><init>(III[B)V

    .line 144
    .line 145
    .line 146
    iput-object v1, v0, Lw3/c;->j:Lq3/t;

    .line 147
    .line 148
    return-void

    .line 149
    :cond_4
    invoke-virtual {v5, v0}, Lw3/d;->d(I)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v5, Lw3/d;->u:Lw3/c;

    .line 153
    .line 154
    new-array v4, v1, [B

    .line 155
    .line 156
    iput-object v4, v0, Lw3/c;->i:[B

    .line 157
    .line 158
    invoke-virtual {v2, v4, v12, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_5
    invoke-virtual {v5, v0}, Lw3/d;->d(I)V

    .line 163
    .line 164
    .line 165
    iget-object v0, v5, Lw3/d;->u:Lw3/c;

    .line 166
    .line 167
    iget v4, v0, Lw3/c;->g:I

    .line 168
    .line 169
    const v5, 0x64767643

    .line 170
    .line 171
    .line 172
    if-eq v4, v5, :cond_7

    .line 173
    .line 174
    const v5, 0x64766343

    .line 175
    .line 176
    .line 177
    if-ne v4, v5, :cond_6

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_6
    invoke-virtual {v2, v1}, Lq3/g;->n(I)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_7
    :goto_0
    new-array v4, v1, [B

    .line 185
    .line 186
    iput-object v4, v0, Lw3/c;->N:[B

    .line 187
    .line 188
    invoke-virtual {v2, v4, v12, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_8
    iget v0, v5, Lw3/d;->G:I

    .line 193
    .line 194
    if-eq v0, v7, :cond_9

    .line 195
    .line 196
    goto/16 :goto_12

    .line 197
    .line 198
    :cond_9
    iget v0, v5, Lw3/d;->M:I

    .line 199
    .line 200
    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, Lw3/c;

    .line 205
    .line 206
    iget v4, v5, Lw3/d;->P:I

    .line 207
    .line 208
    if-ne v4, v6, :cond_a

    .line 209
    .line 210
    const-string v4, "V_VP9"

    .line 211
    .line 212
    iget-object v0, v0, Lw3/c;->b:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    iget-object v0, v5, Lw3/d;->n:LA4/r;

    .line 221
    .line 222
    invoke-virtual {v0, v1}, LA4/r;->E(I)V

    .line 223
    .line 224
    .line 225
    iget-object v0, v0, LA4/r;->c:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, [B

    .line 228
    .line 229
    invoke-virtual {v2, v0, v12, v1, v12}, Lq3/g;->e([BIIZ)Z

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_a
    invoke-virtual {v2, v1}, Lq3/g;->n(I)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_b
    iget v8, v5, Lw3/d;->G:I

    .line 238
    .line 239
    const/16 v11, 0x8

    .line 240
    .line 241
    iget-object v14, v5, Lw3/d;->g:LA4/r;

    .line 242
    .line 243
    if-nez v8, :cond_c

    .line 244
    .line 245
    iget-object v8, v5, Lw3/d;->b:Lw3/e;

    .line 246
    .line 247
    invoke-virtual {v8, v2, v12, v13, v11}, Lw3/e;->c(Lq3/g;ZZI)J

    .line 248
    .line 249
    .line 250
    move-result-wide v9

    .line 251
    long-to-int v9, v9

    .line 252
    iput v9, v5, Lw3/d;->M:I

    .line 253
    .line 254
    iget v8, v8, Lw3/e;->c:I

    .line 255
    .line 256
    iput v8, v5, Lw3/d;->N:I

    .line 257
    .line 258
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    iput-wide v8, v5, Lw3/d;->I:J

    .line 264
    .line 265
    iput v13, v5, Lw3/d;->G:I

    .line 266
    .line 267
    invoke-virtual {v14, v12}, LA4/r;->E(I)V

    .line 268
    .line 269
    .line 270
    :cond_c
    iget v8, v5, Lw3/d;->M:I

    .line 271
    .line 272
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    check-cast v4, Lw3/c;

    .line 277
    .line 278
    if-nez v4, :cond_d

    .line 279
    .line 280
    iget v0, v5, Lw3/d;->N:I

    .line 281
    .line 282
    sub-int v0, v1, v0

    .line 283
    .line 284
    invoke-virtual {v2, v0}, Lq3/g;->n(I)V

    .line 285
    .line 286
    .line 287
    iput v12, v5, Lw3/d;->G:I

    .line 288
    .line 289
    return-void

    .line 290
    :cond_d
    iget-object v8, v4, Lw3/c;->X:Lq3/u;

    .line 291
    .line 292
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    iget v8, v5, Lw3/d;->G:I

    .line 296
    .line 297
    if-ne v8, v13, :cond_22

    .line 298
    .line 299
    const/4 v8, 0x3

    .line 300
    invoke-virtual {v5, v2, v8}, Lw3/d;->k(Lq3/g;I)V

    .line 301
    .line 302
    .line 303
    iget-object v9, v14, LA4/r;->c:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v9, [B

    .line 306
    .line 307
    aget-byte v9, v9, v7

    .line 308
    .line 309
    and-int/lit8 v9, v9, 0x6

    .line 310
    .line 311
    shr-int/2addr v9, v13

    .line 312
    const/16 v10, 0xff

    .line 313
    .line 314
    if-nez v9, :cond_10

    .line 315
    .line 316
    iput v13, v5, Lw3/d;->K:I

    .line 317
    .line 318
    iget-object v6, v5, Lw3/d;->L:[I

    .line 319
    .line 320
    if-nez v6, :cond_e

    .line 321
    .line 322
    new-array v6, v13, [I

    .line 323
    .line 324
    goto :goto_1

    .line 325
    :cond_e
    array-length v9, v6

    .line 326
    if-lt v9, v13, :cond_f

    .line 327
    .line 328
    goto :goto_1

    .line 329
    :cond_f
    array-length v6, v6

    .line 330
    mul-int/2addr v6, v7

    .line 331
    invoke-static {v6, v13}, Ljava/lang/Math;->max(II)I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    new-array v6, v6, [I

    .line 336
    .line 337
    :goto_1
    iput-object v6, v5, Lw3/d;->L:[I

    .line 338
    .line 339
    iget v9, v5, Lw3/d;->N:I

    .line 340
    .line 341
    sub-int/2addr v1, v9

    .line 342
    sub-int/2addr v1, v8

    .line 343
    aput v1, v6, v12

    .line 344
    .line 345
    :goto_2
    move/from16 v19, v12

    .line 346
    .line 347
    move/from16 v17, v13

    .line 348
    .line 349
    goto/16 :goto_b

    .line 350
    .line 351
    :cond_10
    invoke-virtual {v5, v2, v6}, Lw3/d;->k(Lq3/g;I)V

    .line 352
    .line 353
    .line 354
    move/from16 v17, v6

    .line 355
    .line 356
    iget-object v6, v14, LA4/r;->c:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v6, [B

    .line 359
    .line 360
    aget-byte v6, v6, v8

    .line 361
    .line 362
    and-int/2addr v6, v10

    .line 363
    add-int/2addr v6, v13

    .line 364
    iput v6, v5, Lw3/d;->K:I

    .line 365
    .line 366
    iget-object v15, v5, Lw3/d;->L:[I

    .line 367
    .line 368
    if-nez v15, :cond_11

    .line 369
    .line 370
    new-array v15, v6, [I

    .line 371
    .line 372
    goto :goto_3

    .line 373
    :cond_11
    array-length v11, v15

    .line 374
    if-lt v11, v6, :cond_12

    .line 375
    .line 376
    goto :goto_3

    .line 377
    :cond_12
    array-length v11, v15

    .line 378
    mul-int/2addr v11, v7

    .line 379
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 380
    .line 381
    .line 382
    move-result v6

    .line 383
    new-array v15, v6, [I

    .line 384
    .line 385
    :goto_3
    iput-object v15, v5, Lw3/d;->L:[I

    .line 386
    .line 387
    if-ne v9, v7, :cond_13

    .line 388
    .line 389
    iget v6, v5, Lw3/d;->N:I

    .line 390
    .line 391
    sub-int/2addr v1, v6

    .line 392
    add-int/lit8 v1, v1, -0x4

    .line 393
    .line 394
    iget v6, v5, Lw3/d;->K:I

    .line 395
    .line 396
    div-int/2addr v1, v6

    .line 397
    invoke-static {v15, v12, v6, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_13
    if-ne v9, v13, :cond_16

    .line 402
    .line 403
    move v8, v12

    .line 404
    move v9, v8

    .line 405
    move/from16 v6, v17

    .line 406
    .line 407
    :goto_4
    iget v11, v5, Lw3/d;->K:I

    .line 408
    .line 409
    sub-int/2addr v11, v13

    .line 410
    if-ge v8, v11, :cond_15

    .line 411
    .line 412
    iget-object v11, v5, Lw3/d;->L:[I

    .line 413
    .line 414
    aput v12, v11, v8

    .line 415
    .line 416
    :goto_5
    add-int/lit8 v11, v6, 0x1

    .line 417
    .line 418
    invoke-virtual {v5, v2, v11}, Lw3/d;->k(Lq3/g;I)V

    .line 419
    .line 420
    .line 421
    iget-object v15, v14, LA4/r;->c:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v15, [B

    .line 424
    .line 425
    aget-byte v6, v15, v6

    .line 426
    .line 427
    and-int/2addr v6, v10

    .line 428
    iget-object v15, v5, Lw3/d;->L:[I

    .line 429
    .line 430
    aget v16, v15, v8

    .line 431
    .line 432
    add-int v16, v16, v6

    .line 433
    .line 434
    aput v16, v15, v8

    .line 435
    .line 436
    if-eq v6, v10, :cond_14

    .line 437
    .line 438
    add-int v9, v9, v16

    .line 439
    .line 440
    add-int/lit8 v8, v8, 0x1

    .line 441
    .line 442
    move v6, v11

    .line 443
    goto :goto_4

    .line 444
    :cond_14
    move v6, v11

    .line 445
    goto :goto_5

    .line 446
    :cond_15
    iget-object v8, v5, Lw3/d;->L:[I

    .line 447
    .line 448
    iget v15, v5, Lw3/d;->N:I

    .line 449
    .line 450
    sub-int/2addr v1, v15

    .line 451
    sub-int/2addr v1, v6

    .line 452
    sub-int/2addr v1, v9

    .line 453
    aput v1, v8, v11

    .line 454
    .line 455
    goto :goto_2

    .line 456
    :cond_16
    if-ne v9, v8, :cond_21

    .line 457
    .line 458
    move v8, v12

    .line 459
    move v9, v8

    .line 460
    move/from16 v6, v17

    .line 461
    .line 462
    :goto_6
    iget v11, v5, Lw3/d;->K:I

    .line 463
    .line 464
    sub-int/2addr v11, v13

    .line 465
    if-ge v8, v11, :cond_1e

    .line 466
    .line 467
    iget-object v11, v5, Lw3/d;->L:[I

    .line 468
    .line 469
    aput v12, v11, v8

    .line 470
    .line 471
    add-int/lit8 v11, v6, 0x1

    .line 472
    .line 473
    invoke-virtual {v5, v2, v11}, Lw3/d;->k(Lq3/g;I)V

    .line 474
    .line 475
    .line 476
    iget-object v15, v14, LA4/r;->c:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v15, [B

    .line 479
    .line 480
    aget-byte v15, v15, v6

    .line 481
    .line 482
    if-eqz v15, :cond_1d

    .line 483
    .line 484
    move/from16 v17, v13

    .line 485
    .line 486
    move v13, v12

    .line 487
    :goto_7
    const/16 v15, 0x8

    .line 488
    .line 489
    if-ge v13, v15, :cond_19

    .line 490
    .line 491
    rsub-int/lit8 v15, v13, 0x7

    .line 492
    .line 493
    shl-int v15, v17, v15

    .line 494
    .line 495
    move/from16 v19, v12

    .line 496
    .line 497
    iget-object v12, v14, LA4/r;->c:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v12, [B

    .line 500
    .line 501
    aget-byte v12, v12, v6

    .line 502
    .line 503
    and-int/2addr v12, v15

    .line 504
    if-eqz v12, :cond_18

    .line 505
    .line 506
    add-int v12, v11, v13

    .line 507
    .line 508
    invoke-virtual {v5, v2, v12}, Lw3/d;->k(Lq3/g;I)V

    .line 509
    .line 510
    .line 511
    iget-object v7, v14, LA4/r;->c:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v7, [B

    .line 514
    .line 515
    aget-byte v6, v7, v6

    .line 516
    .line 517
    and-int/2addr v6, v10

    .line 518
    not-int v7, v15

    .line 519
    and-int/2addr v6, v7

    .line 520
    int-to-long v6, v6

    .line 521
    :goto_8
    if-ge v11, v12, :cond_17

    .line 522
    .line 523
    const/16 v18, 0x8

    .line 524
    .line 525
    shl-long v6, v6, v18

    .line 526
    .line 527
    iget-object v15, v14, LA4/r;->c:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v15, [B

    .line 530
    .line 531
    add-int/lit8 v20, v11, 0x1

    .line 532
    .line 533
    aget-byte v11, v15, v11

    .line 534
    .line 535
    and-int/2addr v11, v10

    .line 536
    int-to-long v10, v11

    .line 537
    or-long/2addr v6, v10

    .line 538
    move/from16 v11, v20

    .line 539
    .line 540
    const/16 v10, 0xff

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_17
    if-lez v8, :cond_1a

    .line 544
    .line 545
    mul-int/lit8 v13, v13, 0x7

    .line 546
    .line 547
    add-int/lit8 v13, v13, 0x6

    .line 548
    .line 549
    const-wide/16 v10, 0x1

    .line 550
    .line 551
    shl-long v20, v10, v13

    .line 552
    .line 553
    sub-long v20, v20, v10

    .line 554
    .line 555
    sub-long v6, v6, v20

    .line 556
    .line 557
    goto :goto_9

    .line 558
    :cond_18
    add-int/lit8 v13, v13, 0x1

    .line 559
    .line 560
    move/from16 v12, v19

    .line 561
    .line 562
    const/4 v7, 0x2

    .line 563
    const/16 v10, 0xff

    .line 564
    .line 565
    goto :goto_7

    .line 566
    :cond_19
    move/from16 v19, v12

    .line 567
    .line 568
    const-wide/16 v6, 0x0

    .line 569
    .line 570
    move v12, v11

    .line 571
    :cond_1a
    :goto_9
    const-wide/32 v10, -0x80000000

    .line 572
    .line 573
    .line 574
    cmp-long v10, v6, v10

    .line 575
    .line 576
    if-ltz v10, :cond_1c

    .line 577
    .line 578
    const-wide/32 v10, 0x7fffffff

    .line 579
    .line 580
    .line 581
    cmp-long v10, v6, v10

    .line 582
    .line 583
    if-gtz v10, :cond_1c

    .line 584
    .line 585
    long-to-int v6, v6

    .line 586
    iget-object v7, v5, Lw3/d;->L:[I

    .line 587
    .line 588
    if-nez v8, :cond_1b

    .line 589
    .line 590
    goto :goto_a

    .line 591
    :cond_1b
    add-int/lit8 v10, v8, -0x1

    .line 592
    .line 593
    aget v10, v7, v10

    .line 594
    .line 595
    add-int/2addr v6, v10

    .line 596
    :goto_a
    aput v6, v7, v8

    .line 597
    .line 598
    add-int/2addr v9, v6

    .line 599
    add-int/lit8 v8, v8, 0x1

    .line 600
    .line 601
    move v6, v12

    .line 602
    move/from16 v13, v17

    .line 603
    .line 604
    move/from16 v12, v19

    .line 605
    .line 606
    const/4 v7, 0x2

    .line 607
    const/16 v10, 0xff

    .line 608
    .line 609
    goto/16 :goto_6

    .line 610
    .line 611
    :cond_1c
    const-string v0, "EBML lacing sample size out of range."

    .line 612
    .line 613
    const/4 v1, 0x0

    .line 614
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    throw v0

    .line 619
    :cond_1d
    const/4 v1, 0x0

    .line 620
    const-string v0, "No valid varint length mask found"

    .line 621
    .line 622
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    throw v0

    .line 627
    :cond_1e
    move/from16 v19, v12

    .line 628
    .line 629
    move/from16 v17, v13

    .line 630
    .line 631
    iget-object v7, v5, Lw3/d;->L:[I

    .line 632
    .line 633
    iget v8, v5, Lw3/d;->N:I

    .line 634
    .line 635
    sub-int/2addr v1, v8

    .line 636
    sub-int/2addr v1, v6

    .line 637
    sub-int/2addr v1, v9

    .line 638
    aput v1, v7, v11

    .line 639
    .line 640
    :goto_b
    iget-object v1, v14, LA4/r;->c:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v1, [B

    .line 643
    .line 644
    aget-byte v6, v1, v19

    .line 645
    .line 646
    const/16 v18, 0x8

    .line 647
    .line 648
    shl-int/lit8 v6, v6, 0x8

    .line 649
    .line 650
    aget-byte v1, v1, v17

    .line 651
    .line 652
    const/16 v15, 0xff

    .line 653
    .line 654
    and-int/2addr v1, v15

    .line 655
    or-int/2addr v1, v6

    .line 656
    iget-wide v6, v5, Lw3/d;->B:J

    .line 657
    .line 658
    int-to-long v8, v1

    .line 659
    invoke-virtual {v5, v8, v9}, Lw3/d;->m(J)J

    .line 660
    .line 661
    .line 662
    move-result-wide v8

    .line 663
    add-long/2addr v8, v6

    .line 664
    iput-wide v8, v5, Lw3/d;->H:J

    .line 665
    .line 666
    iget v1, v4, Lw3/c;->d:I

    .line 667
    .line 668
    const/4 v6, 0x2

    .line 669
    if-eq v1, v6, :cond_20

    .line 670
    .line 671
    const/16 v15, 0xa3

    .line 672
    .line 673
    if-ne v0, v15, :cond_1f

    .line 674
    .line 675
    iget-object v1, v14, LA4/r;->c:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v1, [B

    .line 678
    .line 679
    aget-byte v1, v1, v6

    .line 680
    .line 681
    const/16 v7, 0x80

    .line 682
    .line 683
    and-int/2addr v1, v7

    .line 684
    if-ne v1, v7, :cond_1f

    .line 685
    .line 686
    goto :goto_c

    .line 687
    :cond_1f
    move/from16 v1, v19

    .line 688
    .line 689
    goto :goto_d

    .line 690
    :cond_20
    :goto_c
    move/from16 v1, v17

    .line 691
    .line 692
    :goto_d
    iput v1, v5, Lw3/d;->O:I

    .line 693
    .line 694
    iput v6, v5, Lw3/d;->G:I

    .line 695
    .line 696
    move/from16 v1, v19

    .line 697
    .line 698
    iput v1, v5, Lw3/d;->J:I

    .line 699
    .line 700
    :goto_e
    const/16 v15, 0xa3

    .line 701
    .line 702
    goto :goto_f

    .line 703
    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 704
    .line 705
    const-string v1, "Unexpected lacing value: "

    .line 706
    .line 707
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    const/4 v1, 0x0

    .line 718
    invoke-static {v0, v1}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    throw v0

    .line 723
    :cond_22
    move/from16 v17, v13

    .line 724
    .line 725
    goto :goto_e

    .line 726
    :goto_f
    if-ne v0, v15, :cond_24

    .line 727
    .line 728
    :goto_10
    iget v0, v5, Lw3/d;->J:I

    .line 729
    .line 730
    iget v1, v5, Lw3/d;->K:I

    .line 731
    .line 732
    if-ge v0, v1, :cond_23

    .line 733
    .line 734
    iget-object v1, v5, Lw3/d;->L:[I

    .line 735
    .line 736
    aget v0, v1, v0

    .line 737
    .line 738
    const/4 v1, 0x0

    .line 739
    invoke-virtual {v5, v2, v4, v0, v1}, Lw3/d;->n(Lq3/g;Lw3/c;IZ)I

    .line 740
    .line 741
    .line 742
    move-result v10

    .line 743
    iget-wide v0, v5, Lw3/d;->H:J

    .line 744
    .line 745
    iget v6, v5, Lw3/d;->J:I

    .line 746
    .line 747
    iget v7, v4, Lw3/c;->e:I

    .line 748
    .line 749
    mul-int/2addr v6, v7

    .line 750
    div-int/lit16 v6, v6, 0x3e8

    .line 751
    .line 752
    int-to-long v6, v6

    .line 753
    add-long/2addr v0, v6

    .line 754
    iget v9, v5, Lw3/d;->O:I

    .line 755
    .line 756
    const/4 v11, 0x0

    .line 757
    move-wide v7, v0

    .line 758
    move-object v6, v4

    .line 759
    invoke-virtual/range {v5 .. v11}, Lw3/d;->e(Lw3/c;JIII)V

    .line 760
    .line 761
    .line 762
    iget v0, v5, Lw3/d;->J:I

    .line 763
    .line 764
    add-int/lit8 v0, v0, 0x1

    .line 765
    .line 766
    iput v0, v5, Lw3/d;->J:I

    .line 767
    .line 768
    goto :goto_10

    .line 769
    :cond_23
    const/4 v1, 0x0

    .line 770
    iput v1, v5, Lw3/d;->G:I

    .line 771
    .line 772
    return-void

    .line 773
    :cond_24
    move-object v6, v4

    .line 774
    :goto_11
    iget v0, v5, Lw3/d;->J:I

    .line 775
    .line 776
    iget v1, v5, Lw3/d;->K:I

    .line 777
    .line 778
    if-ge v0, v1, :cond_25

    .line 779
    .line 780
    iget-object v1, v5, Lw3/d;->L:[I

    .line 781
    .line 782
    aget v4, v1, v0

    .line 783
    .line 784
    move/from16 v7, v17

    .line 785
    .line 786
    invoke-virtual {v5, v2, v6, v4, v7}, Lw3/d;->n(Lq3/g;Lw3/c;IZ)I

    .line 787
    .line 788
    .line 789
    move-result v4

    .line 790
    aput v4, v1, v0

    .line 791
    .line 792
    iget v0, v5, Lw3/d;->J:I

    .line 793
    .line 794
    add-int/2addr v0, v7

    .line 795
    iput v0, v5, Lw3/d;->J:I

    .line 796
    .line 797
    goto :goto_11

    .line 798
    :cond_25
    :goto_12
    return-void
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

.method public j()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Type;

    .line 4
    .line 5
    return-object v0
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

.method public k(Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "GmsCore_OpenSSL"

    .line 2
    .line 3
    const-string v1, "AndroidOpenSSL"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    const/4 v4, 0x2

    .line 17
    if-ge v3, v4, :cond_1

    .line 18
    .line 19
    aget-object v4, v0, v3

    .line 20
    .line 21
    invoke-static {v4}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v3, 0x0

    .line 38
    move-object v4, v3

    .line 39
    :cond_2
    :goto_1
    iget-object v5, p0, Li/G;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Li6/j;

    .line 42
    .line 43
    if-ge v2, v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    check-cast v6, Ljava/security/Provider;

    .line 52
    .line 53
    :try_start_0
    invoke-interface {v5, p1, v6}, Li6/j;->f(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    return-object p1

    .line 58
    :catch_0
    move-exception v5

    .line 59
    if-nez v4, :cond_2

    .line 60
    .line 61
    move-object v4, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-interface {v5, p1, v3}, Li6/j;->f(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
.end method

.method public l()Lt4/n;
    .locals 6

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt4/n;

    .line 4
    .line 5
    iget-object v1, v0, Lt4/n;->a:Lcom/google/android/gms/cast/MediaInfo;

    .line 6
    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    iget-wide v1, v0, Lt4/n;->d:D

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-wide v4, v0, Lt4/n;->d:D

    .line 20
    .line 21
    cmpg-double v1, v4, v2

    .line 22
    .line 23
    if-ltz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v1, "startTime cannot be negative or NaN."

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :cond_1
    :goto_0
    iget-wide v4, v0, Lt4/n;->e:D

    .line 35
    .line 36
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    iget-wide v4, v0, Lt4/n;->f:D

    .line 43
    .line 44
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    iget-wide v4, v0, Lt4/n;->f:D

    .line 51
    .line 52
    cmpg-double v1, v4, v2

    .line 53
    .line 54
    if-ltz v1, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    const-string v1, "preloadTime cannot be negative or Nan."

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string v1, "playbackDuration cannot be NaN."

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    const-string v1, "media cannot be null."

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
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

.method public m(Lo/l;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp/l;

    .line 4
    .line 5
    iget-object v1, v0, Lp/l;->c:Lo/l;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    check-cast v1, Lo/D;

    .line 13
    .line 14
    iget-object v1, v1, Lo/D;->A:Lo/n;

    .line 15
    .line 16
    iget v1, v1, Lo/n;->a:I

    .line 17
    .line 18
    iput v1, v0, Lp/l;->y:I

    .line 19
    .line 20
    iget-object v0, v0, Lp/l;->e:Lo/w;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lo/w;->m(Lo/l;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_1
    return v2
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

.method public declared-synchronized n(Li8/O;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "route"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public o(Ljava/lang/Object;)V
    .locals 17

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    move-object/from16 v2, p0

    .line 4
    .line 5
    iget-object v3, v2, Li/G;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, Lu4/b;

    .line 8
    .line 9
    move-object/from16 v4, p1

    .line 10
    .line 11
    check-cast v4, Landroid/os/Bundle;

    .line 12
    .line 13
    sget-boolean v5, Lcom/google/android/gms/internal/cast/Y;->k:Z

    .line 14
    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    iget-object v7, v3, Lu4/b;->a:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v8, v3, Lu4/b;->f:Ly4/r;

    .line 22
    .line 23
    iget-object v9, v3, Lu4/b;->c:Lu4/h;

    .line 24
    .line 25
    iget-object v10, v3, Lu4/b;->i:Lcom/google/android/gms/internal/cast/w;

    .line 26
    .line 27
    iget-object v11, v3, Lu4/b;->g:Lcom/google/android/gms/internal/cast/g;

    .line 28
    .line 29
    new-instance v6, Lcom/google/android/gms/internal/cast/Y;

    .line 30
    .line 31
    invoke-direct/range {v6 .. v11}, Lcom/google/android/gms/internal/cast/Y;-><init>(Landroid/content/Context;Ly4/r;Lu4/h;Lcom/google/android/gms/internal/cast/w;Lcom/google/android/gms/internal/cast/g;)V

    .line 32
    .line 33
    .line 34
    const-string v3, "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE"

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const-string v3, "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE"

    .line 43
    .line 44
    invoke-virtual {v4, v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string v3, "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED"

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    const-string v3, "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED"

    .line 58
    .line 59
    invoke-virtual {v4, v3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    move v3, v1

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v3, v0

    .line 68
    :goto_0
    const-string v5, "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"

    .line 69
    .line 70
    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const-string v9, "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED"

    .line 75
    .line 76
    invoke-virtual {v4, v9, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    sput-boolean v9, Lcom/google/android/gms/internal/cast/Y;->k:Z

    .line 81
    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    if-nez v5, :cond_3

    .line 85
    .line 86
    if-eqz v9, :cond_12

    .line 87
    .line 88
    :cond_3
    move v3, v0

    .line 89
    :cond_4
    const-string v9, "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"

    .line 90
    .line 91
    const-wide/16 v10, 0x5

    .line 92
    .line 93
    invoke-virtual {v4, v9, v10, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v9

    .line 97
    new-instance v11, Lcom/google/android/gms/internal/cast/z;

    .line 98
    .line 99
    invoke-direct {v11, v7, v9, v10}, Lcom/google/android/gms/internal/cast/z;-><init>(Landroid/content/Context;J)V

    .line 100
    .line 101
    .line 102
    iput-object v11, v6, Lcom/google/android/gms/internal/cast/Y;->h:Lcom/google/android/gms/internal/cast/z;

    .line 103
    .line 104
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 109
    .line 110
    const-string v10, ".client_cast_analytics_data"

    .line 111
    .line 112
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/measurement/k1;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    const-string v11, "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"

    .line 117
    .line 118
    invoke-virtual {v4, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v11

    .line 122
    const-wide/16 v13, 0x0

    .line 123
    .line 124
    cmp-long v11, v11, v13

    .line 125
    .line 126
    if-nez v11, :cond_5

    .line 127
    .line 128
    move v11, v1

    .line 129
    goto :goto_1

    .line 130
    :cond_5
    const/4 v11, 0x2

    .line 131
    :goto_1
    iput v11, v6, Lcom/google/android/gms/internal/cast/Y;->i:I

    .line 132
    .line 133
    invoke-static {v7}, LY2/s;->b(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-static {}, LY2/s;->a()LY2/s;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    sget-object v12, LW2/a;->e:LW2/a;

    .line 141
    .line 142
    invoke-virtual {v11, v12}, LY2/s;->c(LW2/a;)LY2/q;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    const-string v12, "proto"

    .line 147
    .line 148
    new-instance v15, LV2/c;

    .line 149
    .line 150
    invoke-direct {v15, v12}, LV2/c;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    new-instance v12, Lcom/google/android/gms/internal/cast/w0;

    .line 154
    .line 155
    const/16 v13, 0x11

    .line 156
    .line 157
    invoke-direct {v12, v13}, Lcom/google/android/gms/internal/cast/w0;-><init>(I)V

    .line 158
    .line 159
    .line 160
    const-string v13, "CAST_SENDER_SDK"

    .line 161
    .line 162
    invoke-virtual {v11, v13, v15, v12}, LY2/q;->a(Ljava/lang/String;LV2/c;LV2/e;)LY2/r;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    iput-object v11, v6, Lcom/google/android/gms/internal/cast/Y;->g:LY2/r;

    .line 167
    .line 168
    const-string v11, "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"

    .line 169
    .line 170
    invoke-virtual {v4, v11}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    if-eqz v11, :cond_6

    .line 175
    .line 176
    const-string v11, "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"

    .line 177
    .line 178
    invoke-virtual {v4, v11}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 179
    .line 180
    .line 181
    move-result-wide v11

    .line 182
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    iput-object v4, v6, Lcom/google/android/gms/internal/cast/Y;->e:Ljava/lang/Long;

    .line 187
    .line 188
    :cond_6
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4, v10, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    if-eqz v3, :cond_7

    .line 197
    .line 198
    const-string v7, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR"

    .line 199
    .line 200
    const-string v10, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"

    .line 201
    .line 202
    filled-new-array {v7, v10}, [Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-static {}, LD4/n;->g()LD4/n;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    new-instance v11, Lq3/w;

    .line 211
    .line 212
    invoke-direct {v11, v8, v7}, Lq3/w;-><init>(Ly4/r;[Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iput-object v11, v10, LD4/n;->e:Ljava/lang/Object;

    .line 216
    .line 217
    new-array v1, v1, [LB4/d;

    .line 218
    .line 219
    sget-object v7, Lt4/v;->c:LB4/d;

    .line 220
    .line 221
    aput-object v7, v1, v0

    .line 222
    .line 223
    iput-object v1, v10, LD4/n;->b:Ljava/lang/Object;

    .line 224
    .line 225
    iput-boolean v0, v10, LD4/n;->c:Z

    .line 226
    .line 227
    const/16 v1, 0x20ea

    .line 228
    .line 229
    iput v1, v10, LD4/n;->d:I

    .line 230
    .line 231
    invoke-virtual {v10}, LD4/n;->f()LD4/n;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v8, v0, v1}, LC4/j;->c(ILD4/n;)Lf5/q;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v1, LA4/q;

    .line 240
    .line 241
    invoke-direct {v1, v6, v9, v3, v4}, LA4/q;-><init>(Lcom/google/android/gms/internal/cast/Y;Ljava/lang/String;ILandroid/content/SharedPreferences;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    sget-object v3, Lf5/j;->a:LD4/q;

    .line 248
    .line 249
    invoke-virtual {v0, v3, v1}, Lf5/q;->d(Ljava/util/concurrent/Executor;Lf5/e;)Lf5/q;

    .line 250
    .line 251
    .line 252
    :cond_7
    if-eqz v5, :cond_11

    .line 253
    .line 254
    invoke-static {v4}, LF4/y;->h(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lcom/google/android/gms/internal/cast/x0;->i:Ly4/b;

    .line 258
    .line 259
    const-class v1, Lcom/google/android/gms/internal/cast/x0;

    .line 260
    .line 261
    monitor-enter v1

    .line 262
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/cast/x0;->k:Lcom/google/android/gms/internal/cast/x0;

    .line 263
    .line 264
    if-nez v0, :cond_8

    .line 265
    .line 266
    new-instance v0, Lcom/google/android/gms/internal/cast/x0;

    .line 267
    .line 268
    invoke-direct {v0, v4, v6, v9}, Lcom/google/android/gms/internal/cast/x0;-><init>(Landroid/content/SharedPreferences;Lcom/google/android/gms/internal/cast/Y;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    sput-object v0, Lcom/google/android/gms/internal/cast/x0;->k:Lcom/google/android/gms/internal/cast/x0;

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :catchall_0
    move-exception v0

    .line 275
    goto/16 :goto_7

    .line 276
    .line 277
    :cond_8
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/cast/x0;->k:Lcom/google/android/gms/internal/cast/x0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 278
    .line 279
    monitor-exit v1

    .line 280
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/x0;->f:Ljava/util/HashSet;

    .line 281
    .line 282
    iget-object v3, v0, Lcom/google/android/gms/internal/cast/x0;->b:Landroid/content/SharedPreferences;

    .line 283
    .line 284
    const-string v4, "feature_usage_sdk_version"

    .line 285
    .line 286
    const/4 v5, 0x0

    .line 287
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    const-string v7, "feature_usage_package_name"

    .line 292
    .line 293
    invoke-interface {v3, v7, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 298
    .line 299
    .line 300
    iget-object v8, v0, Lcom/google/android/gms/internal/cast/x0;->g:Ljava/util/HashSet;

    .line 301
    .line 302
    invoke-virtual {v8}, Ljava/util/HashSet;->clear()V

    .line 303
    .line 304
    .line 305
    const-wide/16 v9, 0x0

    .line 306
    .line 307
    iput-wide v9, v0, Lcom/google/android/gms/internal/cast/x0;->h:J

    .line 308
    .line 309
    sget-object v11, Lcom/google/android/gms/internal/cast/x0;->j:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    const-string v12, "feature_usage_timestamp_"

    .line 316
    .line 317
    const-string v13, "feature_usage_last_report_time"

    .line 318
    .line 319
    iget-object v14, v0, Lcom/google/android/gms/internal/cast/x0;->c:Ljava/lang/String;

    .line 320
    .line 321
    if-eqz v6, :cond_e

    .line 322
    .line 323
    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-nez v5, :cond_9

    .line 328
    .line 329
    goto/16 :goto_4

    .line 330
    .line 331
    :cond_9
    invoke-interface {v3, v13, v9, v10}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v4

    .line 335
    iput-wide v4, v0, Lcom/google/android/gms/internal/cast/x0;->h:J

    .line 336
    .line 337
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 338
    .line 339
    .line 340
    move-result-wide v4

    .line 341
    new-instance v6, Ljava/util/HashSet;

    .line 342
    .line 343
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 344
    .line 345
    .line 346
    invoke-interface {v3}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    :cond_a
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    if-eqz v9, :cond_d

    .line 363
    .line 364
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    check-cast v9, Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v9, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    if-eqz v10, :cond_a

    .line 375
    .line 376
    const-wide/16 v10, 0x0

    .line 377
    .line 378
    invoke-interface {v3, v9, v10, v11}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 379
    .line 380
    .line 381
    move-result-wide v13

    .line 382
    cmp-long v15, v13, v10

    .line 383
    .line 384
    if-eqz v15, :cond_b

    .line 385
    .line 386
    sub-long v13, v4, v13

    .line 387
    .line 388
    const-wide/32 v15, 0x48190800

    .line 389
    .line 390
    .line 391
    cmp-long v13, v13, v15

    .line 392
    .line 393
    if-lez v13, :cond_b

    .line 394
    .line 395
    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    goto :goto_3

    .line 399
    :cond_b
    const-string v13, "feature_usage_timestamp_reported_feature_"

    .line 400
    .line 401
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v13

    .line 405
    const/16 v14, 0x29

    .line 406
    .line 407
    if-eqz v13, :cond_c

    .line 408
    .line 409
    invoke-virtual {v9, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    invoke-static {v9}, Lcom/google/android/gms/internal/cast/x0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/cast/y0;

    .line 414
    .line 415
    .line 416
    move-result-object v9

    .line 417
    if-eqz v9, :cond_a

    .line 418
    .line 419
    invoke-virtual {v8, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_3

    .line 426
    :cond_c
    const-string v13, "feature_usage_timestamp_detected_feature_"

    .line 427
    .line 428
    invoke-virtual {v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 429
    .line 430
    .line 431
    move-result v13

    .line 432
    if-eqz v13, :cond_a

    .line 433
    .line 434
    invoke-virtual {v9, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    invoke-static {v9}, Lcom/google/android/gms/internal/cast/x0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/cast/y0;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    if-eqz v9, :cond_a

    .line 443
    .line 444
    invoke-virtual {v1, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_3

    .line 448
    :cond_d
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/cast/x0;->c(Ljava/util/HashSet;)V

    .line 449
    .line 450
    .line 451
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/x0;->e:LT4/d;

    .line 452
    .line 453
    invoke-static {v1}, LF4/y;->h(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/x0;->d:Lcom/google/android/gms/internal/cast/y;

    .line 457
    .line 458
    invoke-static {v1}, LF4/y;->h(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/x0;->e:LT4/d;

    .line 462
    .line 463
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/x0;->d:Lcom/google/android/gms/internal/cast/y;

    .line 464
    .line 465
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 466
    .line 467
    .line 468
    goto :goto_6

    .line 469
    :cond_e
    :goto_4
    new-instance v1, Ljava/util/HashSet;

    .line 470
    .line 471
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 472
    .line 473
    .line 474
    invoke-interface {v3}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    :cond_f
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    if-eqz v6, :cond_10

    .line 491
    .line 492
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    check-cast v6, Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {v6, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 499
    .line 500
    .line 501
    move-result v8

    .line 502
    if-eqz v8, :cond_f

    .line 503
    .line 504
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    goto :goto_5

    .line 508
    :cond_10
    invoke-virtual {v1, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cast/x0;->c(Ljava/util/HashSet;)V

    .line 512
    .line 513
    .line 514
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-interface {v0, v4, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-interface {v0, v7, v14}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 527
    .line 528
    .line 529
    :goto_6
    sget-object v0, Lcom/google/android/gms/internal/cast/y0;->g:Lcom/google/android/gms/internal/cast/y0;

    .line 530
    .line 531
    invoke-static {v0}, Lcom/google/android/gms/internal/cast/x0;->a(Lcom/google/android/gms/internal/cast/y0;)V

    .line 532
    .line 533
    .line 534
    goto :goto_8

    .line 535
    :goto_7
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 536
    throw v0

    .line 537
    :cond_11
    :goto_8
    sget-boolean v0, Lcom/google/android/gms/internal/cast/Y;->k:Z

    .line 538
    .line 539
    if-eqz v0, :cond_12

    .line 540
    .line 541
    invoke-static {}, Lcom/google/android/gms/internal/cast/u1;->a()V

    .line 542
    .line 543
    .line 544
    :cond_12
    :goto_9
    return-void
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

.method public p(JI)V
    .locals 9

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw3/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x5031

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, " not supported"

    .line 12
    .line 13
    if-eq p3, v1, :cond_16

    .line 14
    .line 15
    const/16 v1, 0x5032

    .line 16
    .line 17
    const-wide/16 v4, 0x1

    .line 18
    .line 19
    if-eq p3, v1, :cond_14

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/4 v6, 0x3

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x2

    .line 25
    sparse-switch p3, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    packed-switch p3, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 35
    .line 36
    .line 37
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 38
    .line 39
    long-to-int p1, p1

    .line 40
    iput p1, p3, Lw3/c;->C:I

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_1
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 44
    .line 45
    .line 46
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 47
    .line 48
    long-to-int p1, p1

    .line 49
    iput p1, p3, Lw3/c;->B:I

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_2
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 53
    .line 54
    .line 55
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 56
    .line 57
    iput-boolean v1, p3, Lw3/c;->x:Z

    .line 58
    .line 59
    long-to-int p1, p1

    .line 60
    invoke-static {p1}, Lm4/b;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eq p1, v2, :cond_17

    .line 65
    .line 66
    iget-object p2, v0, Lw3/d;->u:Lw3/c;

    .line 67
    .line 68
    iput p1, p2, Lw3/c;->y:I

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 72
    .line 73
    .line 74
    long-to-int p1, p1

    .line 75
    if-eq p1, v1, :cond_2

    .line 76
    .line 77
    const/16 p2, 0x10

    .line 78
    .line 79
    const/4 p3, 0x6

    .line 80
    if-eq p1, p2, :cond_1

    .line 81
    .line 82
    const/16 p2, 0x12

    .line 83
    .line 84
    const/4 v1, 0x7

    .line 85
    if-eq p1, p2, :cond_0

    .line 86
    .line 87
    if-eq p1, p3, :cond_2

    .line 88
    .line 89
    if-eq p1, v1, :cond_2

    .line 90
    .line 91
    move v6, v2

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    move v6, v1

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    move v6, p3

    .line 96
    :cond_2
    :goto_0
    if-eq v6, v2, :cond_17

    .line 97
    .line 98
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 99
    .line 100
    iput v6, p1, Lw3/c;->z:I

    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_4
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 104
    .line 105
    .line 106
    long-to-int p1, p1

    .line 107
    if-eq p1, v1, :cond_4

    .line 108
    .line 109
    if-eq p1, v8, :cond_3

    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :cond_3
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 114
    .line 115
    iput v1, p1, Lw3/c;->A:I

    .line 116
    .line 117
    return-void

    .line 118
    :cond_4
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 119
    .line 120
    iput v8, p1, Lw3/c;->A:I

    .line 121
    .line 122
    return-void

    .line 123
    :sswitch_0
    iput-wide p1, v0, Lw3/d;->r:J

    .line 124
    .line 125
    return-void

    .line 126
    :sswitch_1
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 127
    .line 128
    .line 129
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 130
    .line 131
    long-to-int p1, p1

    .line 132
    iput p1, p3, Lw3/c;->e:I

    .line 133
    .line 134
    return-void

    .line 135
    :sswitch_2
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 136
    .line 137
    .line 138
    long-to-int p1, p1

    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    if-eq p1, v1, :cond_7

    .line 142
    .line 143
    if-eq p1, v8, :cond_6

    .line 144
    .line 145
    if-eq p1, v6, :cond_5

    .line 146
    .line 147
    goto/16 :goto_3

    .line 148
    .line 149
    :cond_5
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 150
    .line 151
    iput v6, p1, Lw3/c;->r:I

    .line 152
    .line 153
    return-void

    .line 154
    :cond_6
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 155
    .line 156
    iput v8, p1, Lw3/c;->r:I

    .line 157
    .line 158
    return-void

    .line 159
    :cond_7
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 160
    .line 161
    iput v1, p1, Lw3/c;->r:I

    .line 162
    .line 163
    return-void

    .line 164
    :cond_8
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 165
    .line 166
    iput v7, p1, Lw3/c;->r:I

    .line 167
    .line 168
    return-void

    .line 169
    :sswitch_3
    iput-wide p1, v0, Lw3/d;->R:J

    .line 170
    .line 171
    return-void

    .line 172
    :sswitch_4
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 173
    .line 174
    .line 175
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 176
    .line 177
    long-to-int p1, p1

    .line 178
    iput p1, p3, Lw3/c;->P:I

    .line 179
    .line 180
    return-void

    .line 181
    :sswitch_5
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 182
    .line 183
    .line 184
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 185
    .line 186
    iput-wide p1, p3, Lw3/c;->S:J

    .line 187
    .line 188
    return-void

    .line 189
    :sswitch_6
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 190
    .line 191
    .line 192
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 193
    .line 194
    iput-wide p1, p3, Lw3/c;->R:J

    .line 195
    .line 196
    return-void

    .line 197
    :sswitch_7
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 198
    .line 199
    .line 200
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 201
    .line 202
    long-to-int p1, p1

    .line 203
    iput p1, p3, Lw3/c;->f:I

    .line 204
    .line 205
    return-void

    .line 206
    :sswitch_8
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 207
    .line 208
    .line 209
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 210
    .line 211
    cmp-long p1, p1, v4

    .line 212
    .line 213
    if-nez p1, :cond_9

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_9
    move v1, v7

    .line 217
    :goto_1
    iput-boolean v1, p3, Lw3/c;->U:Z

    .line 218
    .line 219
    return-void

    .line 220
    :sswitch_9
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 221
    .line 222
    .line 223
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 224
    .line 225
    long-to-int p1, p1

    .line 226
    iput p1, p3, Lw3/c;->p:I

    .line 227
    .line 228
    return-void

    .line 229
    :sswitch_a
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 230
    .line 231
    .line 232
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 233
    .line 234
    long-to-int p1, p1

    .line 235
    iput p1, p3, Lw3/c;->q:I

    .line 236
    .line 237
    return-void

    .line 238
    :sswitch_b
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 239
    .line 240
    .line 241
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 242
    .line 243
    long-to-int p1, p1

    .line 244
    iput p1, p3, Lw3/c;->o:I

    .line 245
    .line 246
    return-void

    .line 247
    :sswitch_c
    long-to-int p1, p1

    .line 248
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 249
    .line 250
    .line 251
    if-eqz p1, :cond_d

    .line 252
    .line 253
    if-eq p1, v1, :cond_c

    .line 254
    .line 255
    if-eq p1, v6, :cond_b

    .line 256
    .line 257
    const/16 p2, 0xf

    .line 258
    .line 259
    if-eq p1, p2, :cond_a

    .line 260
    .line 261
    goto/16 :goto_3

    .line 262
    .line 263
    :cond_a
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 264
    .line 265
    iput v6, p1, Lw3/c;->w:I

    .line 266
    .line 267
    return-void

    .line 268
    :cond_b
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 269
    .line 270
    iput v1, p1, Lw3/c;->w:I

    .line 271
    .line 272
    return-void

    .line 273
    :cond_c
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 274
    .line 275
    iput v8, p1, Lw3/c;->w:I

    .line 276
    .line 277
    return-void

    .line 278
    :cond_d
    iget-object p1, v0, Lw3/d;->u:Lw3/c;

    .line 279
    .line 280
    iput v7, p1, Lw3/c;->w:I

    .line 281
    .line 282
    return-void

    .line 283
    :sswitch_d
    iget-wide v1, v0, Lw3/d;->q:J

    .line 284
    .line 285
    add-long/2addr p1, v1

    .line 286
    iput-wide p1, v0, Lw3/d;->x:J

    .line 287
    .line 288
    return-void

    .line 289
    :sswitch_e
    cmp-long p3, p1, v4

    .line 290
    .line 291
    if-nez p3, :cond_e

    .line 292
    .line 293
    goto/16 :goto_3

    .line 294
    .line 295
    :cond_e
    new-instance p3, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string v0, "AESSettingsCipherMode "

    .line 298
    .line 299
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    throw p1

    .line 317
    :sswitch_f
    const-wide/16 v0, 0x5

    .line 318
    .line 319
    cmp-long p3, p1, v0

    .line 320
    .line 321
    if-nez p3, :cond_f

    .line 322
    .line 323
    goto/16 :goto_3

    .line 324
    .line 325
    :cond_f
    new-instance p3, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v0, "ContentEncAlgo "

    .line 328
    .line 329
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    throw p1

    .line 347
    :sswitch_10
    cmp-long p3, p1, v4

    .line 348
    .line 349
    if-nez p3, :cond_10

    .line 350
    .line 351
    goto/16 :goto_3

    .line 352
    .line 353
    :cond_10
    new-instance p3, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v0, "EBMLReadVersion "

    .line 356
    .line 357
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    throw p1

    .line 375
    :sswitch_11
    cmp-long p3, p1, v4

    .line 376
    .line 377
    if-ltz p3, :cond_11

    .line 378
    .line 379
    const-wide/16 v0, 0x2

    .line 380
    .line 381
    cmp-long p3, p1, v0

    .line 382
    .line 383
    if-gtz p3, :cond_11

    .line 384
    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :cond_11
    new-instance p3, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    const-string v0, "DocTypeReadVersion "

    .line 390
    .line 391
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    throw p1

    .line 409
    :sswitch_12
    const-wide/16 v0, 0x3

    .line 410
    .line 411
    cmp-long p3, p1, v0

    .line 412
    .line 413
    if-nez p3, :cond_12

    .line 414
    .line 415
    goto/16 :goto_3

    .line 416
    .line 417
    :cond_12
    new-instance p3, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v0, "ContentCompAlgo "

    .line 420
    .line 421
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    throw p1

    .line 439
    :sswitch_13
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 440
    .line 441
    .line 442
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 443
    .line 444
    long-to-int p1, p1

    .line 445
    iput p1, p3, Lw3/c;->g:I

    .line 446
    .line 447
    return-void

    .line 448
    :sswitch_14
    iput-boolean v1, v0, Lw3/d;->Q:Z

    .line 449
    .line 450
    return-void

    .line 451
    :sswitch_15
    iget-boolean v2, v0, Lw3/d;->E:Z

    .line 452
    .line 453
    if-nez v2, :cond_17

    .line 454
    .line 455
    invoke-virtual {v0, p3}, Lw3/d;->c(I)V

    .line 456
    .line 457
    .line 458
    iget-object p3, v0, Lw3/d;->D:LA1/i;

    .line 459
    .line 460
    invoke-virtual {p3, p1, p2}, LA1/i;->a(J)V

    .line 461
    .line 462
    .line 463
    iput-boolean v1, v0, Lw3/d;->E:Z

    .line 464
    .line 465
    return-void

    .line 466
    :sswitch_16
    long-to-int p1, p1

    .line 467
    iput p1, v0, Lw3/d;->P:I

    .line 468
    .line 469
    return-void

    .line 470
    :sswitch_17
    invoke-virtual {v0, p1, p2}, Lw3/d;->m(J)J

    .line 471
    .line 472
    .line 473
    move-result-wide p1

    .line 474
    iput-wide p1, v0, Lw3/d;->B:J

    .line 475
    .line 476
    return-void

    .line 477
    :sswitch_18
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 478
    .line 479
    .line 480
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 481
    .line 482
    long-to-int p1, p1

    .line 483
    iput p1, p3, Lw3/c;->c:I

    .line 484
    .line 485
    return-void

    .line 486
    :sswitch_19
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 487
    .line 488
    .line 489
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 490
    .line 491
    long-to-int p1, p1

    .line 492
    iput p1, p3, Lw3/c;->n:I

    .line 493
    .line 494
    return-void

    .line 495
    :sswitch_1a
    invoke-virtual {v0, p3}, Lw3/d;->c(I)V

    .line 496
    .line 497
    .line 498
    iget-object p3, v0, Lw3/d;->C:LA1/i;

    .line 499
    .line 500
    invoke-virtual {v0, p1, p2}, Lw3/d;->m(J)J

    .line 501
    .line 502
    .line 503
    move-result-wide p1

    .line 504
    invoke-virtual {p3, p1, p2}, LA1/i;->a(J)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :sswitch_1b
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 509
    .line 510
    .line 511
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 512
    .line 513
    long-to-int p1, p1

    .line 514
    iput p1, p3, Lw3/c;->m:I

    .line 515
    .line 516
    return-void

    .line 517
    :sswitch_1c
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 518
    .line 519
    .line 520
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 521
    .line 522
    long-to-int p1, p1

    .line 523
    iput p1, p3, Lw3/c;->O:I

    .line 524
    .line 525
    return-void

    .line 526
    :sswitch_1d
    invoke-virtual {v0, p1, p2}, Lw3/d;->m(J)J

    .line 527
    .line 528
    .line 529
    move-result-wide p1

    .line 530
    iput-wide p1, v0, Lw3/d;->I:J

    .line 531
    .line 532
    return-void

    .line 533
    :sswitch_1e
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 534
    .line 535
    .line 536
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 537
    .line 538
    cmp-long p1, p1, v4

    .line 539
    .line 540
    if-nez p1, :cond_13

    .line 541
    .line 542
    goto :goto_2

    .line 543
    :cond_13
    move v1, v7

    .line 544
    :goto_2
    iput-boolean v1, p3, Lw3/c;->V:Z

    .line 545
    .line 546
    return-void

    .line 547
    :sswitch_1f
    invoke-virtual {v0, p3}, Lw3/d;->d(I)V

    .line 548
    .line 549
    .line 550
    iget-object p3, v0, Lw3/d;->u:Lw3/c;

    .line 551
    .line 552
    long-to-int p1, p1

    .line 553
    iput p1, p3, Lw3/c;->d:I

    .line 554
    .line 555
    return-void

    .line 556
    :cond_14
    cmp-long p3, p1, v4

    .line 557
    .line 558
    if-nez p3, :cond_15

    .line 559
    .line 560
    goto :goto_3

    .line 561
    :cond_15
    new-instance p3, Ljava/lang/StringBuilder;

    .line 562
    .line 563
    const-string v0, "ContentEncodingScope "

    .line 564
    .line 565
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    throw p1

    .line 583
    :cond_16
    const-wide/16 v0, 0x0

    .line 584
    .line 585
    cmp-long p3, p1, v0

    .line 586
    .line 587
    if-nez p3, :cond_18

    .line 588
    .line 589
    :cond_17
    :goto_3
    return-void

    .line 590
    :cond_18
    new-instance p3, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    const-string v0, "ContentEncodingOrder "

    .line 593
    .line 594
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    invoke-static {p1, v2}, Lj3/j0;->a(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    throw p1

    .line 612
    nop

    .line 613
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_1f
        0x88 -> :sswitch_1e
        0x9b -> :sswitch_1d
        0x9f -> :sswitch_1c
        0xb0 -> :sswitch_1b
        0xb3 -> :sswitch_1a
        0xba -> :sswitch_19
        0xd7 -> :sswitch_18
        0xe7 -> :sswitch_17
        0xee -> :sswitch_16
        0xf1 -> :sswitch_15
        0xfb -> :sswitch_14
        0x41e7 -> :sswitch_13
        0x4254 -> :sswitch_12
        0x4285 -> :sswitch_11
        0x42f7 -> :sswitch_10
        0x47e1 -> :sswitch_f
        0x47e8 -> :sswitch_e
        0x53ac -> :sswitch_d
        0x53b8 -> :sswitch_c
        0x54b0 -> :sswitch_b
        0x54b2 -> :sswitch_a
        0x54ba -> :sswitch_9
        0x55aa -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public q(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ll3/H;

    .line 11
    .line 12
    iget-object v0, v0, Ll3/H;->d1:Ll3/m;

    .line 13
    .line 14
    iget-object v1, v0, Ll3/m;->b:Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v2, Ll3/k;

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    invoke-direct {v2, v0, p1, v3}, Ll3/k;-><init>(Ll3/m;Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
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

.method public r(Lq3/g;LI3/g;)LD3/c;
    .locals 8

    .line 1
    iget-object v0, p0, Li/G;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA4/r;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v1

    .line 8
    :goto_0
    :try_start_0
    iget-object v4, v0, LA4/r;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v4, [B

    .line 11
    .line 12
    const/16 v5, 0xa

    .line 13
    .line 14
    invoke-virtual {p1, v4, v1, v5, v1}, Lq3/g;->t([BIIZ)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, LA4/r;->H(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LA4/r;->z()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const v6, 0x494433

    .line 25
    .line 26
    .line 27
    if-eq v4, v6, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const/4 v4, 0x3

    .line 31
    invoke-virtual {v0, v4}, LA4/r;->I(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LA4/r;->w()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    add-int/lit8 v6, v4, 0xa

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    new-array v2, v6, [B

    .line 43
    .line 44
    iget-object v7, v0, LA4/r;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v7, [B

    .line 47
    .line 48
    invoke-static {v7, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v2, v5, v4, v1}, Lq3/g;->t([BIIZ)Z

    .line 52
    .line 53
    .line 54
    new-instance v4, LI3/i;

    .line 55
    .line 56
    invoke-direct {v4, p2}, LI3/i;-><init>(LI3/g;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v6, v2}, LI3/i;->a0(I[B)LD3/c;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p1, v4, v1}, Lq3/g;->c(IZ)Z

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/2addr v3, v6

    .line 68
    goto :goto_0

    .line 69
    :catch_0
    :goto_2
    iput v1, p1, Lq3/g;->f:I

    .line 70
    .line 71
    invoke-virtual {p1, v3, v1}, Lq3/g;->c(IZ)Z

    .line 72
    .line 73
    .line 74
    return-object v2
    .line 75
    .line 76
    .line 77
    .line 78
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
    .line 109
    .line 110
    .line 111
    .line 112
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
.end method

.method public s(Ljava/lang/Object;)Lf5/q;
    .locals 3

    .line 1
    check-cast p1, LG6/c;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, "FirebaseCrashlytics"

    .line 7
    .line 8
    const-string v1, "Received null app settings at app startup. Cannot send cached reports"

    .line 9
    .line 10
    invoke-static {p1, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Li/G;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lk4/E;

    .line 21
    .line 22
    iget-object v1, p1, Lk4/E;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ly6/l;

    .line 25
    .line 26
    invoke-static {v1}, Ly6/l;->a(Ly6/l;)Lf5/q;

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, Lk4/E;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ly6/l;

    .line 32
    .line 33
    iget-object v1, p1, Ly6/l;->m:Lp/c1;

    .line 34
    .line 35
    iget-object v2, p1, Ly6/l;->e:Lz6/d;

    .line 36
    .line 37
    iget-object v2, v2, Lz6/d;->a:Lz6/b;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, Lp/c1;->m(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lf5/q;

    .line 40
    .line 41
    .line 42
    iget-object p1, p1, Ly6/l;->q:Lf5/i;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
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
.end method
