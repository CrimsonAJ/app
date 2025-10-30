.class public final Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;
.super Lo7/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/k;"
    }
.end annotation


# instance fields
.field public final a:Lk4/E;

.field public final b:Lo7/k;

.field public final c:Lo7/k;

.field public final d:Lo7/k;

.field public final e:Lo7/k;

.field public final f:Lo7/k;


# direct methods
.method public constructor <init>(Lo7/y;)V
    .locals 11

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v9, "update_at"

    .line 10
    .line 11
    const-string v10, "movie"

    .line 12
    .line 13
    const-string v1, "id"

    .line 14
    .line 15
    const-string v2, "movie_id"

    .line 16
    .line 17
    const-string v3, "episode_number"

    .line 18
    .line 19
    const-string v4, "episode_name"

    .line 20
    .line 21
    const-string v5, "datetime"

    .line 22
    .line 23
    const-string v6, "publish"

    .line 24
    .line 25
    const-string v7, "created_at"

    .line 26
    .line 27
    const-string v8, "created_by"

    .line 28
    .line 29
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lk4/E;->o([Ljava/lang/String;)Lk4/E;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->a:Lk4/E;

    .line 38
    .line 39
    sget-object v0, LB7/v;->a:LB7/v;

    .line 40
    .line 41
    const-string v1, "id"

    .line 42
    .line 43
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->b:Lo7/k;

    .line 50
    .line 51
    const-string v1, "movieId"

    .line 52
    .line 53
    const-class v2, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->c:Lo7/k;

    .line 60
    .line 61
    const-string v1, "episodeNumber"

    .line 62
    .line 63
    const-class v2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->d:Lo7/k;

    .line 70
    .line 71
    const-string v1, "episodeName"

    .line 72
    .line 73
    const-class v2, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->e:Lo7/k;

    .line 80
    .line 81
    const-string v1, "movie"

    .line 82
    .line 83
    const-class v2, Lcom/anilab/data/model/response/MovieResponse;

    .line 84
    .line 85
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->f:Lo7/k;

    .line 90
    .line 91
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method


# virtual methods
.method public final b(Lo7/n;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "reader"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lo7/n;->d()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move-object v6, v2

    .line 15
    move-object v7, v6

    .line 16
    move-object v8, v7

    .line 17
    move-object v9, v8

    .line 18
    move-object v10, v9

    .line 19
    move-object v11, v10

    .line 20
    move-object v12, v11

    .line 21
    move-object v13, v12

    .line 22
    move-object v14, v13

    .line 23
    :goto_0
    invoke-virtual {v1}, Lo7/n;->F()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const-string v4, "id"

    .line 28
    .line 29
    const-string v15, "movie"

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    iget-object v3, v0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->a:Lk4/E;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lo7/n;->h0(Lk4/E;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v5, v0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->d:Lo7/k;

    .line 40
    .line 41
    move-object/from16 v16, v2

    .line 42
    .line 43
    iget-object v2, v0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->e:Lo7/k;

    .line 44
    .line 45
    move/from16 v17, v3

    .line 46
    .line 47
    iget-object v3, v0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->c:Lo7/k;

    .line 48
    .line 49
    packed-switch v17, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :pswitch_0
    iget-object v2, v0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->f:Lo7/k;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v14, v2

    .line 60
    check-cast v14, Lcom/anilab/data/model/response/MovieResponse;

    .line 61
    .line 62
    if-eqz v14, :cond_0

    .line 63
    .line 64
    :goto_1
    move-object/from16 v2, v16

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {v15, v15, v1}, Lp7/e;->j(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    throw v1

    .line 72
    :pswitch_1
    invoke-virtual {v3, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    move-object v13, v2

    .line 77
    check-cast v13, Ljava/lang/Long;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_2
    invoke-virtual {v2, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v12, v2

    .line 85
    check-cast v12, Ljava/lang/String;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :pswitch_3
    invoke-virtual {v3, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    move-object v11, v2

    .line 93
    check-cast v11, Ljava/lang/Long;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_4
    invoke-virtual {v5, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    move-object v10, v2

    .line 101
    check-cast v10, Ljava/lang/Integer;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_5
    invoke-virtual {v2, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v9, v2

    .line 109
    check-cast v9, Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_6
    invoke-virtual {v2, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    move-object v8, v2

    .line 117
    check-cast v8, Ljava/lang/String;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :pswitch_7
    invoke-virtual {v5, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v7, v2

    .line 125
    check-cast v7, Ljava/lang/Integer;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_8
    invoke-virtual {v3, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object v6, v2

    .line 133
    check-cast v6, Ljava/lang/Long;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_9
    iget-object v2, v0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->b:Lo7/k;

    .line 137
    .line 138
    invoke-virtual {v2, v1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Ljava/lang/Long;

    .line 143
    .line 144
    if-eqz v2, :cond_1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_1
    invoke-static {v4, v4, v1}, Lp7/e;->j(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    throw v1

    .line 152
    :pswitch_a
    invoke-virtual {v1}, Lo7/n;->i0()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Lo7/n;->j0()V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    move-object/from16 v16, v2

    .line 160
    .line 161
    invoke-virtual {v1}, Lo7/n;->s()V

    .line 162
    .line 163
    .line 164
    new-instance v3, Lcom/anilab/data/model/response/ReleaseCalendarResponse;

    .line 165
    .line 166
    if-eqz v16, :cond_4

    .line 167
    .line 168
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v4

    .line 172
    if-eqz v14, :cond_3

    .line 173
    .line 174
    invoke-direct/range {v3 .. v14}, Lcom/anilab/data/model/response/ReleaseCalendarResponse;-><init>(JLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/anilab/data/model/response/MovieResponse;)V

    .line 175
    .line 176
    .line 177
    return-object v3

    .line 178
    :cond_3
    invoke-static {v15, v15, v1}, Lp7/e;->e(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    throw v1

    .line 183
    :cond_4
    invoke-static {v4, v4, v1}, Lp7/e;->e(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    throw v1

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final e(Lo7/q;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;

    .line 2
    .line 3
    const-string v0, "writer"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lo7/q;->d()Lo7/p;

    .line 11
    .line 12
    .line 13
    const-string v0, "id"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 16
    .line 17
    .line 18
    iget-wide v0, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->a:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->b:Lo7/k;

    .line 25
    .line 26
    invoke-virtual {v1, p1, v0}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "movie_id"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->c:Lo7/k;

    .line 35
    .line 36
    iget-object v1, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->b:Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const-string v1, "episode_number"

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->d:Lo7/k;

    .line 47
    .line 48
    iget-object v2, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->c:Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v1, p1, v2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "episode_name"

    .line 54
    .line 55
    invoke-virtual {p1, v2}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->e:Lo7/k;

    .line 59
    .line 60
    iget-object v3, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->d:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2, p1, v3}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const-string v3, "datetime"

    .line 66
    .line 67
    invoke-virtual {p1, v3}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 68
    .line 69
    .line 70
    iget-object v3, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->e:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v2, p1, v3}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string v3, "publish"

    .line 76
    .line 77
    invoke-virtual {p1, v3}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 78
    .line 79
    .line 80
    iget-object v3, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->f:Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v1, p1, v3}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const-string v1, "created_at"

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 88
    .line 89
    .line 90
    iget-object v1, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->g:Ljava/lang/Long;

    .line 91
    .line 92
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const-string v1, "created_by"

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 98
    .line 99
    .line 100
    iget-object v1, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->h:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v2, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    const-string v1, "update_at"

    .line 106
    .line 107
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 108
    .line 109
    .line 110
    iget-object v1, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->i:Ljava/lang/Long;

    .line 111
    .line 112
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    const-string v0, "movie"

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 118
    .line 119
    .line 120
    iget-object p2, p2, Lcom/anilab/data/model/response/ReleaseCalendarResponse;->j:Lcom/anilab/data/model/response/MovieResponse;

    .line 121
    .line 122
    iget-object v0, p0, Lcom/anilab/data/model/response/ReleaseCalendarResponseJsonAdapter;->f:Lo7/k;

    .line 123
    .line 124
    invoke-virtual {v0, p1, p2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lo7/q;->g()Lo7/p;

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 132
    .line 133
    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    .line 134
    .line 135
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x2d

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(ReleaseCalendarResponse)"

    .line 4
    .line 5
    invoke-static {v0, v1}, LA0/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
