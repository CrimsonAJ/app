.class public final Lco/notix/jg;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:I

.field public final synthetic b:Lco/notix/banner/NotixBannerView;


# direct methods
.method public constructor <init>(Lco/notix/banner/NotixBannerView;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
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


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 1

    .line 1
    new-instance p1, Lco/notix/jg;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lco/notix/jg;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/jg;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/jg;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/jg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, Lco/notix/jg;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 34
    .line 35
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->access$isAttachedF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v1, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 40
    .line 41
    invoke-static {v1}, Lco/notix/banner/NotixBannerView;->access$isVisibleF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v5, Lco/notix/eg;

    .line 46
    .line 47
    invoke-direct {v5, v2}, Lco/notix/eg;-><init>(LE7/d;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Lb8/D;

    .line 51
    .line 52
    invoke-direct {v6, p1, v1, v5}, Lb8/D;-><init>(Lb8/F;Lb8/F;Lco/notix/eg;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lco/notix/fg;

    .line 56
    .line 57
    invoke-direct {p1, v2}, Lco/notix/fg;-><init>(LE7/d;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lb8/s;

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-direct {v1, v6, p1, v5}, Lb8/s;-><init>(Lb8/e;LO7/p;I)V

    .line 64
    .line 65
    .line 66
    iput v4, p0, Lco/notix/jg;->a:I

    .line 67
    .line 68
    invoke-static {v1, p0}, Lb8/M;->h(Lb8/e;LE7/d;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    :goto_0
    iget-object p1, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 76
    .line 77
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->access$getLoader$p(Lco/notix/banner/NotixBannerView;)Lco/notix/banner/NotixBannerLoader;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-eqz p1, :cond_5

    .line 82
    .line 83
    iput v3, p0, Lco/notix/jg;->a:I

    .line 84
    .line 85
    const-wide/16 v3, 0x1388

    .line 86
    .line 87
    invoke-interface {p1, v3, v4, p0}, Lco/notix/banner/NotixBannerLoader;->awaitNext(JLE7/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_4

    .line 92
    .line 93
    :goto_1
    return-object v0

    .line 94
    :cond_4
    :goto_2
    check-cast p1, Lco/notix/banner/BannerData;

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move-object p1, v2

    .line 98
    :goto_3
    instance-of v0, p1, Lco/notix/k7;

    .line 99
    .line 100
    if-eqz v0, :cond_6

    .line 101
    .line 102
    check-cast p1, Lco/notix/k7;

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    move-object p1, v2

    .line 106
    :goto_4
    sget-object v0, LA7/n;->a:LA7/n;

    .line 107
    .line 108
    const/4 v1, 0x3

    .line 109
    if-eqz p1, :cond_9

    .line 110
    .line 111
    iget-object p1, p1, Lco/notix/k7;->a:Lco/notix/g;

    .line 112
    .line 113
    if-nez p1, :cond_7

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_7
    iget-object v3, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 117
    .line 118
    invoke-static {v3}, Lco/notix/banner/NotixBannerView;->access$getRequest$p(Lco/notix/banner/NotixBannerView;)Lco/notix/banner/BannerRequest;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-eqz v4, :cond_8

    .line 123
    .line 124
    invoke-virtual {v4}, Lco/notix/banner/BannerRequest;->getSize()Lco/notix/banner/BannerSize;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    goto :goto_5

    .line 129
    :cond_8
    move-object v4, v2

    .line 130
    :goto_5
    invoke-static {v3, v4}, Lco/notix/banner/NotixBannerView;->access$setResponseSize$p(Lco/notix/banner/NotixBannerView;Lco/notix/banner/BannerSize;)V

    .line 131
    .line 132
    .line 133
    iget-object v3, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 134
    .line 135
    invoke-static {v3}, Lco/notix/banner/NotixBannerView;->access$getCsMain$p(Lco/notix/banner/NotixBannerView;)LY7/z;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    new-instance v4, Lco/notix/gg;

    .line 140
    .line 141
    iget-object v5, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 142
    .line 143
    invoke-direct {v4, v5, p1, v2}, Lco/notix/gg;-><init>(Lco/notix/banner/NotixBannerView;Lco/notix/g;LE7/d;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v3, v2, v4, v1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 147
    .line 148
    .line 149
    iget-object v3, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 150
    .line 151
    invoke-static {v3}, Lco/notix/banner/NotixBannerView;->access$getTimeVisibleF$p(Lco/notix/banner/NotixBannerView;)Lb8/F;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    new-instance v4, Ljava/lang/Long;

    .line 156
    .line 157
    const-wide/16 v5, 0x0

    .line 158
    .line 159
    invoke-direct {v4, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 160
    .line 161
    .line 162
    check-cast v3, Lb8/Q;

    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v2, v4}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    sget-object v3, Lco/notix/uf;->a:Lco/notix/tf;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    iget-object v3, v3, Lco/notix/tf;->b:Lco/notix/vf;

    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-interface {p1}, Lco/notix/g;->a()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object v3, v3, Lco/notix/vf;->d:Lco/notix/ia;

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    const-string v4, "data"

    .line 190
    .line 191
    invoke-static {p1, v4}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-object v4, v3, Lco/notix/ia;->c:LY7/z;

    .line 195
    .line 196
    new-instance v5, Lco/notix/w9;

    .line 197
    .line 198
    invoke-direct {v5, v3, p1, v2}, Lco/notix/w9;-><init>(Lco/notix/ia;Ljava/lang/String;LE7/d;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v4, v2, v5, v1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 202
    .line 203
    .line 204
    iget-object p1, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 205
    .line 206
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->access$getCallbackExecutor$p(Lco/notix/banner/NotixBannerView;)Lco/notix/mg;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance v1, Lco/notix/hg;

    .line 211
    .line 212
    iget-object v2, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 213
    .line 214
    invoke-direct {v1, v2}, Lco/notix/hg;-><init>(Lco/notix/banner/NotixBannerView;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v1}, Lco/notix/mg;->a(LO7/a;)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_9
    :goto_6
    iget-object p1, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 222
    .line 223
    invoke-static {p1}, Lco/notix/banner/NotixBannerView;->access$getCallbackExecutor$p(Lco/notix/banner/NotixBannerView;)Lco/notix/mg;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-object v3, p0, Lco/notix/jg;->b:Lco/notix/banner/NotixBannerView;

    .line 228
    .line 229
    iget-object p1, p1, Lco/notix/mg;->a:LY7/z;

    .line 230
    .line 231
    new-instance v4, Lco/notix/ig;

    .line 232
    .line 233
    invoke-direct {v4, v3, v2}, Lco/notix/ig;-><init>(Lco/notix/banner/NotixBannerView;LE7/d;)V

    .line 234
    .line 235
    .line 236
    invoke-static {p1, v2, v4, v1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 237
    .line 238
    .line 239
    return-object v0
    .line 240
.end method
