.class public final LV1/a;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/W0;


# direct methods
.method public constructor <init>(LJ1/W0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV1/a;->u:LJ1/W0;

    .line 5
    .line 6
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/anilab/domain/model/FilterConfig;

    .line 2
    .line 3
    iget-object v0, p0, LV1/a;->u:LJ1/W0;

    .line 4
    .line 5
    iget-object v1, v0, LJ1/W0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 6
    .line 7
    const v2, 0x7f080091

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LF0/r0;->a:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const v2, 0x7f060382

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v0, v0, LJ1/W0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p1, Lcom/anilab/domain/model/FilterConfig;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
.end method
