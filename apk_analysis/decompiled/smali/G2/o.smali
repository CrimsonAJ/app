.class public final LG2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# instance fields
.field public final a:LG2/s;

.field public final b:LG2/m;

.field public final c:LG2/h;


# direct methods
.method public constructor <init>(LG2/s;LG2/m;LG2/h;)V
    .locals 1

    .line 1
    const-string v0, "movieMapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "filterMapper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "continueWatchMapper"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LG2/o;->a:LG2/s;

    .line 20
    .line 21
    iput-object p2, p0, LG2/o;->b:LG2/m;

    .line 22
    .line 23
    iput-object p3, p0, LG2/o;->c:LG2/h;

    .line 24
    .line 25
    return-void
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
.end method


# virtual methods
.method public final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/HomeResponse;

    .line 2
    .line 3
    const-string v0, "dto"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LG2/o;->a:LG2/s;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p1, Lcom/anilab/data/model/response/HomeResponse;->d:Ljava/util/List;

    .line 12
    .line 13
    iget-object v3, p1, Lcom/anilab/data/model/response/HomeResponse;->c:Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ne v4, v1, :cond_1

    .line 23
    .line 24
    new-instance p1, LH2/m;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p1, v0}, LH2/m;-><init>(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    :goto_0
    const/4 v4, 0x0

    .line 38
    const-string v5, ""

    .line 39
    .line 40
    iget-object v6, p1, Lcom/anilab/data/model/response/HomeResponse;->b:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v7, p1, Lcom/anilab/data/model/response/HomeResponse;->a:Ljava/lang/String;

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const/4 v9, 0x4

    .line 52
    if-ne v8, v9, :cond_5

    .line 53
    .line 54
    new-instance v0, LH2/k;

    .line 55
    .line 56
    new-instance v1, Lcom/anilab/domain/model/Shortcut;

    .line 57
    .line 58
    if-nez v7, :cond_3

    .line 59
    .line 60
    move-object v7, v5

    .line 61
    :cond_3
    if-nez v6, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move-object v5, v6

    .line 65
    :goto_1
    sget-object v2, LB7/t;->a:LB7/t;

    .line 66
    .line 67
    invoke-direct {v1, v7, v5, v2, v4}, Lcom/anilab/domain/model/Shortcut;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p1, Lcom/anilab/data/model/response/HomeResponse;->g:Ljava/util/List;

    .line 71
    .line 72
    iget-object v2, p0, LG2/o;->c:LG2/h;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {v2, p1}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v0, v1, p1}, LH2/k;-><init>(Lcom/anilab/domain/model/Shortcut;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_5
    :goto_2
    new-instance v8, LH2/l;

    .line 86
    .line 87
    new-instance v9, Lcom/anilab/domain/model/Shortcut;

    .line 88
    .line 89
    if-nez v7, :cond_6

    .line 90
    .line 91
    move-object v7, v5

    .line 92
    :cond_6
    if-nez v6, :cond_7

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    move-object v5, v6

    .line 96
    :goto_3
    iget-object v6, p0, LG2/o;->b:LG2/m;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object p1, p1, Lcom/anilab/data/model/response/HomeResponse;->e:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {v6, p1}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-nez v3, :cond_8

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    const/4 v6, 0x3

    .line 115
    if-ne v3, v6, :cond_9

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_9
    :goto_4
    move v1, v4

    .line 119
    :goto_5
    invoke-direct {v9, v7, v5, p1, v1}, Lcom/anilab/domain/model/Shortcut;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v2}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {v8, v9, p1}, LH2/l;-><init>(Lcom/anilab/domain/model/Shortcut;Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    return-object v8
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
