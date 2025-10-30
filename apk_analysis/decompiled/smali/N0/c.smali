.class public final synthetic LN0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN0/c;->a:I

    iput-object p2, p0, LN0/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/w;Landroidx/lifecycle/o;)V
    .locals 6

    .line 1
    iget v0, p0, LN0/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN0/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lw0/f;

    .line 9
    .line 10
    const-string v1, "this$0"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 16
    .line 17
    if-ne p2, v1, :cond_3

    .line 18
    .line 19
    move-object p2, p1

    .line 20
    check-cast p2, Li0/v;

    .line 21
    .line 22
    invoke-virtual {v0}, Lu0/V;->b()Lu0/o;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v1, v1, Lu0/o;->f:Lb8/H;

    .line 27
    .line 28
    iget-object v1, v1, Lb8/H;->a:Lb8/F;

    .line 29
    .line 30
    check-cast v1, Lb8/Q;

    .line 31
    .line 32
    invoke-virtual {v1}, Lb8/Q;->h()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    move-object v4, v3

    .line 54
    check-cast v4, Lu0/m;

    .line 55
    .line 56
    iget-object v4, v4, Lu0/m;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v5, p2, Li0/v;->y:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    move-object v2, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    check-cast v2, Lu0/m;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-static {}, Lw0/f;->n()Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    new-instance p2, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v1, "Marking transition complete for entry "

    .line 81
    .line 82
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, " due to fragment "

    .line 89
    .line 90
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " lifecycle reaching DESTROYED"

    .line 97
    .line 98
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-string p2, "FragmentNavigator"

    .line 106
    .line 107
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-virtual {v0}, Lu0/V;->b()Lu0/o;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1, v2}, Lu0/o;->b(Lu0/m;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void

    .line 118
    :pswitch_0
    iget-object p1, p0, LN0/c;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lu0/H;

    .line 121
    .line 122
    const-string v0, "this$0"

    .line 123
    .line 124
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Landroidx/lifecycle/o;->a()Landroidx/lifecycle/p;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, p1, Lu0/H;->q:Landroidx/lifecycle/p;

    .line 132
    .line 133
    iget-object v0, p1, Lu0/H;->c:Lu0/F;

    .line 134
    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    iget-object p1, p1, Lu0/H;->g:LB7/i;

    .line 138
    .line 139
    invoke-static {p1}, LB7/k;->I0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v1, 0x0

    .line 148
    :goto_1
    if-ge v1, v0, :cond_4

    .line 149
    .line 150
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    add-int/lit8 v1, v1, 0x1

    .line 155
    .line 156
    check-cast v2, Lu0/m;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Landroidx/lifecycle/o;->a()Landroidx/lifecycle/p;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    iput-object v3, v2, Lu0/m;->d:Landroidx/lifecycle/p;

    .line 166
    .line 167
    invoke-virtual {v2}, Lu0/m;->d()V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    return-void

    .line 172
    :pswitch_1
    iget-object p1, p0, LN0/c;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p1, LN0/f;

    .line 175
    .line 176
    const-string v0, "this$0"

    .line 177
    .line 178
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    sget-object v0, Landroidx/lifecycle/o;->ON_START:Landroidx/lifecycle/o;

    .line 182
    .line 183
    if-ne p2, v0, :cond_5

    .line 184
    .line 185
    const/4 p2, 0x1

    .line 186
    iput-boolean p2, p1, LN0/f;->c:Z

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_5
    sget-object v0, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 190
    .line 191
    if-ne p2, v0, :cond_6

    .line 192
    .line 193
    const/4 p2, 0x0

    .line 194
    iput-boolean p2, p1, LN0/f;->c:Z

    .line 195
    .line 196
    :cond_6
    :goto_2
    return-void

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 198
    .line 199
.end method
