.class public final synthetic LN1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN1/f;

.field public final synthetic c:Lcom/anilab/domain/model/Movie;


# direct methods
.method public synthetic constructor <init>(LN1/f;Lcom/anilab/domain/model/Movie;I)V
    .locals 0

    .line 1
    iput p3, p0, LN1/c;->a:I

    iput-object p1, p0, LN1/c;->b:LN1/f;

    iput-object p2, p0, LN1/c;->c:Lcom/anilab/domain/model/Movie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, LN1/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LN1/c;->b:LN1/f;

    .line 7
    .line 8
    iget-object p1, p1, LN1/f;->g:LG0/h;

    .line 9
    .line 10
    iget-object v0, p0, LN1/c;->c:Lcom/anilab/domain/model/Movie;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, LG0/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object p1, p0, LN1/c;->b:LN1/f;

    .line 17
    .line 18
    iget-object p1, p1, LN1/f;->g:LG0/h;

    .line 19
    .line 20
    iget-object v0, p0, LN1/c;->c:Lcom/anilab/domain/model/Movie;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, LG0/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
