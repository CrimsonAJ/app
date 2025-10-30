.class public final Lco/notix/nr;
.super Lco/notix/pr;
.source "SourceFile"


# static fields
.field public static final a:Lco/notix/nr;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/nr;

    invoke-direct {v0}, Lco/notix/nr;-><init>()V

    sput-object v0, Lco/notix/nr;->a:Lco/notix/nr;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/notix/pr;-><init>(I)V

    return-void
.end method
