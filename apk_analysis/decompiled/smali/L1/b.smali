.class public final synthetic LL1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/c;
.implements Lf/b;


# instance fields
.field public final synthetic a:Lcom/anilab/android/ui/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/activity/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL1/b;->a:Lcom/anilab/android/ui/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public G(Lf5/h;)V
    .locals 6

    .line 1
    iget-object v0, p0, LL1/b;->a:Lcom/anilab/android/ui/activity/MainActivity;

    .line 2
    .line 3
    sget v1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 4
    .line 5
    const-string v1, "task"

    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p1}, Lf5/h;->j()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v1, v1, LL1/S;->i:LL2/G;

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    invoke-virtual {v1, v2}, LL2/G;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0}, Ls8/e;->u(Landroid/content/Context;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "uuid"

    .line 45
    .line 46
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v5, LL1/O;

    .line 50
    .line 51
    invoke-direct {v5, v1, v4, v3}, LL1/O;-><init>(LL1/S;Ljava/lang/String;LE7/d;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2, v5}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v0}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1}, Lf5/h;->g()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v1, "getResult(...)"

    .line 66
    .line 67
    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    new-instance v1, LL1/L;

    .line 73
    .line 74
    invoke-direct {v1, v0, p1, v3}, LL1/L;-><init>(LL1/S;Ljava/lang/String;LE7/d;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    :catch_0
    :cond_1
    return-void
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

.method public d(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lf/a;

    .line 4
    .line 5
    sget v1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 6
    .line 7
    iget-object v1, v0, Lf/a;->b:Landroid/content/Intent;

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    iget v0, v0, Lf/a;->a:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_3

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    new-instance v3, LH2/u;

    .line 17
    .line 18
    const-string v0, "extra_id"

    .line 19
    .line 20
    const-wide/16 v4, -0x1

    .line 21
    .line 22
    invoke-virtual {v1, v0, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    const-string v0, "extra_episode_id"

    .line 27
    .line 28
    invoke-virtual {v1, v0, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    const-string v0, "extra_position_ms"

    .line 33
    .line 34
    const-wide/16 v8, 0x0

    .line 35
    .line 36
    invoke-virtual {v1, v0, v8, v9}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v8

    .line 40
    const-string v0, "extra_name"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v2, ""

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    move-object v10, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v10, v0

    .line 53
    :goto_0
    const-string v0, "extra_poster"

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    move-object v11, v2

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object v11, v0

    .line 64
    :goto_1
    const-string v0, "extra_percent"

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    const-string v0, "extra_year"

    .line 72
    .line 73
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 74
    .line 75
    .line 76
    move-result v13

    .line 77
    const-string v0, "extra_al_names"

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    sget-object v0, LB7/t;->a:LB7/t;

    .line 86
    .line 87
    :cond_2
    move-wide v15, v6

    .line 88
    move-wide v6, v4

    .line 89
    move-wide v4, v15

    .line 90
    move-object v14, v0

    .line 91
    invoke-direct/range {v3 .. v14}, LH2/u;-><init>(JJJLjava/lang/String;Ljava/lang/String;IILjava/util/List;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v0, p0

    .line 95
    .line 96
    iget-object v1, v0, LL1/b;->a:Lcom/anilab/android/ui/activity/MainActivity;

    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/anilab/android/ui/activity/MainActivity;->V()LL1/S;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1, v3}, LL1/S;->g(LH2/u;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    move-object/from16 v0, p0

    .line 107
    .line 108
    return-void
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
