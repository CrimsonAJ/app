.class public final Le2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/myList/MyListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/myList/MyListFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Le2/m;->a:I

    iput-object p1, p0, Le2/m;->b:Lcom/anilab/android/ui/myList/MyListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p2, p0, Le2/m;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    iget-object p2, p0, Le2/m;->b:Lcom/anilab/android/ui/myList/MyListFragment;

    .line 9
    .line 10
    iget-object v0, p2, Lcom/anilab/android/ui/myList/MyListFragment;->E0:LA7/l;

    .line 11
    .line 12
    invoke-virtual {v0}, LA7/l;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Le2/j;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LF0/I;->o(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/anilab/android/ui/myList/MyListFragment;->t0()Le2/B;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, Le2/B;->g:LP2/e;

    .line 26
    .line 27
    iget-object v0, v0, LP2/e;->a:LC2/g0;

    .line 28
    .line 29
    invoke-virtual {v0}, LC2/g0;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const-string v0, "layoutEmpty"

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p2}, LM1/n;->e0()LW/g;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, LJ1/g0;

    .line 49
    .line 50
    iget-object p1, p1, LJ1/g0;->y:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 51
    .line 52
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p2}, LM1/n;->e0()LW/g;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, LJ1/g0;

    .line 64
    .line 65
    iget-object p1, p1, LJ1/g0;->y:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 66
    .line 67
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 p2, 0x8

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {p2}, LM1/n;->e0()LW/g;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, LJ1/g0;

    .line 81
    .line 82
    const-string p2, "groupSignInRequire"

    .line 83
    .line 84
    iget-object p1, p1, LJ1/g0;->x:Landroidx/constraintlayout/widget/Group;

    .line 85
    .line 86
    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    :goto_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    iget-object p1, p0, Le2/m;->b:Lcom/anilab/android/ui/myList/MyListFragment;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/anilab/android/ui/myList/MyListFragment;->t0()Le2/B;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object p1, p1, Le2/B;->j:Lb8/Q;

    .line 110
    .line 111
    sget-object p2, LB7/t;->a:LB7/t;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    invoke-virtual {p1, v0, p2}, Lb8/Q;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :cond_2
    sget-object p1, LA7/n;->a:LA7/n;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
